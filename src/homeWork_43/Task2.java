package homeWork_43;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    /*
    Task 2
Дан список строк.

Используя Stream API, отфильтруйте строки, которые начинаются на
определенную букву (например, "A") и отсортируйте их в алфавитном порядке.

Результат сохраните в новый список строк.

Опционально + удалите дубликаты из списка строк
     */

    public static void main(String[] args) {

        List<String> fruitsList = Arrays.asList("apple", "banana", "avocado", "blueberry", "avocado", "cherry", "tomato", "orange", "apricot");

        System.out.println(filterStringsStartingWith(fruitsList, 'a'));


    }// main

    private static List<String> filterStringsStartingWith(List<String> srings, char letter){


        Stream<String> filterStream = srings.stream()
                .filter(s -> s.startsWith(String.valueOf(letter)))
                .distinct()
                .sorted();

        List<String> newList = filterStream.collect(Collectors.toList());
        return newList;

    }
}
