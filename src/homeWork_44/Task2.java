package homeWork_44;

import java.util.*;

public class Task2 {

    public static void main(String[] args) {

        List<String> strings = List.of("Hello", "Bye", "City", "Town", "Problem", "Au");
        shortestString(strings);

    } // main

    /*
    Task 2
Имеется список строк. Используя Stream API, найдите строку с минимальной длиной.
     */

    public static Optional<String> shortestString(List<String> stringList) {

        Optional<String> shortestString = stringList.stream()
               .filter(Objects::nonNull)
                .min(Comparator.comparingInt(String::length));


        if (shortestString.isPresent()) {
            System.out.println("Минимальная строка: " + shortestString.get());
        }else {
            System.out.println("Нет строк с мин длиной");
        }

        return shortestString;
    }
}
