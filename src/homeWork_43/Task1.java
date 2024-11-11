package homeWork_43;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

    public static void main(String[] args) {

        List<Integer> oldList = List.of(2, 45, -23, 10, 24, 44, 12, 38, 57, -1, 99, 101);
        List<Integer> filteredNumbers = getNewList(oldList);
        System.out.println(filteredNumbers);


    }

    /*
    Task 1
Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.

В новом списке должны быть только те числа из старого списка, которые соответствуют всем условиям:
четные, больше 10 и меньше 100

Для фильтрации используйте Stream API
     */

    public static List<Integer> getNewList(List<Integer> numbers){
        if (numbers == null) {
            return new ArrayList<>(); //numbers == null
        }

       return numbers.stream()
                .filter( n -> n % 2 == 0 && n > 10 && n < 100)
               .collect(Collectors.toList());



    }
}
