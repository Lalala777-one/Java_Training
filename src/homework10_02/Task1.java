package homework10_02;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3, 4, 5};
        copyOfArray(array, 10);


    }

    public static void copyOfArray(int[] array, int newLength) {
        int[] result = new int[newLength]; // данный массив заполняется значениями типа int по умолчанию (для int это 0)
        String arrayStr = Arrays.toString(result); // быстрый способ напечатать массив


        for (int i = 0; i < array.length && i < newLength; i++) {
            result[i] = array[i];
        }
        System.out.println(Arrays.toString(result));
    }
}


