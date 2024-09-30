package homeWork11_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        int[] arrayInt = {3, 5, 12, 5, 43, 5, 15};
        int[] newArray = deleteNumber(arrayInt, 5);
        System.out.println(Arrays.toString(newArray));

    }

    // Method Task4

    public static int[] deleteNumber (int[] array, int numberToRemove){

        if (array == null || array.length == 0) {
            return new int[0];
        }

        int count = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == numberToRemove) {
                count++;
            }
        }

        int[] newArray = new int[array.length - count];

        int index = 0;

        for (int j = 0; j < array.length; j++) {
            if(array[j] != numberToRemove){
                newArray[index] = array[j];
                index++;
            }
        }
        return newArray;
    }
}
