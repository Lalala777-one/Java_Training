package homeWork_38.task1.task2;

import java.util.Arrays;

public class MyComparatorApp {

    public static void main(String[] args) {

        Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };

        // Сортировка с использованием компаратора
        Arrays.sort(integers, new MyComparator());


        System.out.println("=========================");
        System.out.println(Arrays.toString(integers));
    }

    }

