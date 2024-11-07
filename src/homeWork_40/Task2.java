package homeWork_40;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Set<String> cars = new LinkedHashSet<>(List.of("BMW", "Audi", "Ferrari", "Porsche", "Mercedes", "Volkswagen", "Ford"));
       Set<String> carsPro = new LinkedHashSet<>(List.of("Bugatti", "Bentley", "Porsche", "Mercedes", "Audi", "Mitsubishi" ));

       Set<String> unionMethodResult = union(cars, carsPro);
        System.out.println(unionMethodResult);

        Set<String> intersectionResult = intersection(cars, carsPro);
        System.out.println(intersectionResult);

        Set<String> differenceResult = difference(cars, carsPro);
        System.out.println(differenceResult);
    }

    // Реализуйте метод union(Set<String> set1, Set<String> set2), который возвращает множество,
    // содержащее все уникальные элементы из обоих множеств (объединение множеств).

    private static Set<String> union(Set<String> set1, Set<String> set2){
        Set<String> result = new LinkedHashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    // Реализуйте метод intersection(Set<String> set1, Set<String> set2), который возвращает множество,
    // содержащее только элементы, которые присутствуют в обоих исходных множествах (пересечение множеств).

    private static Set<String> intersection(Set<String> set1, Set<String> set2){
        Set<String> result = new LinkedHashSet<>(set1);
        result.retainAll(set2);
        return result;
        }


        //Реализуйте метод difference(Set<String> set1, Set<String> set2), который возвращает множество элементов,
        // которые есть в первом множестве, но отсутствуют во втором (разность множеств).
    private static Set<String> difference(Set<String> set1, Set<String> set2){
        Set<String> result = new LinkedHashSet<>(set1);
        result.removeAll(set2);
        return result;
    }
    }

