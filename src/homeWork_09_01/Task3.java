package homeWork_09_01;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int length = 50;
        int[] array = new int[length];

        int i = 0;
        while (i < length) {
            array[i] = 1 + random.nextInt(100);
            i++;
        }

        System.out.print("Сгенерированный массив: ");

         i = 0;

        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();

        System.out.print("Простые числа в массиве: ");
        int primeCount = 0;
        i = 0; // Сбрасываем индекс для вывода простых чисел

        while (i < array.length) {
            if (isPrime(array[i])) {
                System.out.print(array[i] + " ");
                primeCount++;
            }
            i++;
        }
        System.out.println();
        System.out.println("Количество простых чисел: " + primeCount);

    }

    public static boolean isPrime(int num) {
        if (num <= 0) {
            return false;
        }
        int i = 2;
        while (i <= Math.sqrt(num)) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;

    }
}


