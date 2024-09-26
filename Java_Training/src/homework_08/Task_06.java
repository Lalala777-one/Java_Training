package homework_08;

import java.util.Random;

public class Task_06 {
    public static void main(String[] args) {
        Random random = new Random();
        int length = 5 + random.nextInt(11);
        int[] array = new int[length];

        System.out.println(array.length);

        int i = 0;
        while (i < array.length) {
            array[i] = random.nextInt(101) - 50;
            i++;
        }

        System.out.println("Массив: ");
        i = 0;
        System.out.print("[ ");
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.print("]");

        // Минимальное значение массива

        int min = array[0];
        int t = 0;
        while (t < array.length) {
            if (array[t] < min) {
                min = array[t];
            }
            t++;
        }
        System.out.println();
        System.out.println("Минимальное число в массиве: " + min);

        // Максимальное значение массива

        int max = array[0];
        int t1 = 0;
        while (t1 < array.length) {
            if (array[t1] > max) {
                max = array[t1];

            }
            t1++;
        }
        System.out.println("Максимальное число в массиве: " + max);


        // среднее арифметическое всех значений массива

        int in0 = 0;
        int sum = 0;

        while (in0 < array.length) {
            sum += array[in0];
            in0++;
        }

        int count = array.length;
        double average = (double) sum / count;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

    }

}



