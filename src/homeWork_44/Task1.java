package homeWork_44;

import java.util.AbstractMap;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {

        List<Integer> integers = List.of(1, 23, 45, 35, 67, 82, 356, 12);
        sortNumbersByLastDigit(integers);

    } // main


     /*
    Task 1
Из списка целых чисел выделите те значения, которые больше 10; отсортируйте
эти значения по значению последней цифры в числе и выведите результат на экране
     */

    public static void sortNumbersByLastDigit (List<Integer> intList){
        List<Integer> sortedList =
                intList.stream()
                        .filter(integer -> integer > 10)
                        .map(i -> new AbstractMap.SimpleEntry<>(i, i % 10))
                        .sorted(Comparator.comparingInt(Map.Entry::getValue))
                        .map(Map.Entry:: getKey)
                        .collect(Collectors.toList());
        System.out.println(sortedList);

    }
}
