package lesson12;

import java.util.Arrays;
import java.util.Random;

public class ArraysMain {
    public static void main(String[] args) {

        int[] ints = {34, 21, 67, 41, 10, 80, 0, 87, 99, 57, 3, 77};
        System.out.println( "Length " + ints.length);


        int index = ArraysUtil.linearSearch(ints, 100);
        System.out.println("index " + index);

        System.out.println("Массив до сортировки");
        System.out.println(Arrays.toString(ints));

        ArraysUtil.sortSelection(ints);

        System.out.println("Массив после сортировки");
        System.out.println(Arrays.toString(ints));

        int number = 87;
       int ind =  ArraysUtil.binarySearch(ints, number);
        System.out.println("Индекс числа в массиве: " + ind );

        // после того как индекс был найден можно по нему делать какие то изменения с данным значением
        // например изменить его значение

        int[] testArray = new int[100_000];
        Random random = new Random();
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = random.nextInt(100_055);

        }

        ArraysUtil.sortSelection(testArray);
        number = 9900;
        ind = ArraysUtil.binarySearch(testArray, number);
        System.out.println("Индекс числа в тестовом массиве (бинарный поиск): " + ind);
        System.out.println();

        ind = ArraysUtil.linearSearch(testArray, number);
        System.out.println("Индекс числа в тестовом массиве (линейный поиск): " + ind);



        }





    }
