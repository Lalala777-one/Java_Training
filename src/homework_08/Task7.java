package homework_08;

import com.sun.jdi.Value;

public class Task7 {
    public static void main(String[] args) {

        int[] array = {2, 12, -45, 34, 8, -19};

        int maxIndex = 0;
        int minIndex = 0;
        int i = 0;

        while (i < array.length) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
            if (array[i] > array[maxIndex]) {
                minIndex = i;
            }
            i++;
        }

        // меняем местами

        int change = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = change;


        System.out.println("Измененный массив: ");

        int j = 0;
        while (j < array.length){
            System.out.print(array[j] + " ");
            j++;
        }

    }
}





