package homeWork_44;

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {

        List<Integer> integersToFilter = List.of(2, 5, 5, 7, 8, 12, 15, 22);
        System.out.println(filterAndMultiplyEvenNumbers(integersToFilter));

    }// main

    /*
    Task 3
Имеется список целых чисел.

Необходимо отфильтровать этот список,
оставив только чётные числа, затем каждое число умножить на 2, и собрать результат в новый список
     */

    public static List<Integer> filterAndMultiplyEvenNumbers (List<Integer> integersList){
      List<Integer> filtersIntegers = integersList.stream()
              .filter(i -> i % 2 == 0)
              .map(i -> i * 2)
              .collect(Collectors.toList());


      return filtersIntegers;

    }
}
