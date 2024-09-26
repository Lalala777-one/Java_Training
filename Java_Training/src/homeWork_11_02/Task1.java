package homeWork_11_02;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int[] array = {0, 1, 2, 4, 6, 8, 9, 15};

        System.out.println(Arrays.toString(array));
        System.out.println("Sum: " + sum(array));

        int[] array2 = null;
        System.out.println(sum(array2));

    }

    // Method

    public static int sum(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("В метод передан некоррентный массив");
            return Integer.MIN_VALUE;
        }

        int summma = 0;

        for (int i = 0; i < array.length; i++) {
            summma += array[i];
        }
        return summma;
    }

    public static double averageArray(int[] array) {

        if(array == null){
            return Integer.MIN_VALUE;
        }

        double sum = sum(array);
        double average = sum / array.length;
        return average;
    }
}



