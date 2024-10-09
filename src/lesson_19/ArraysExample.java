package lesson_19;

// Arrays предоставляет различные статические методы для работы с массивами

import java.util.Arrays;

public class ArraysExample {

    public static void main(String[] args) {

        int[] array = {3, 2, 1, 0};
        // метод который возвращает строковое представление массива  Arrays.toString

        String arrayToString = Arrays.toString(array);
        //System.out.println(arrayToString);
        System.out.println(Arrays.toString(array));


        //метод для сортировки масства
        System.out.println("============Сортировка массива=============");

        Arrays.sort(array); // полная сортировка массива
        // Arrays.sort(array, 1, 3); // от начального включит до конечного невключит
        System.out.println(Arrays.toString(array));

        System.out.println("============== Бинарный поиск====================");
        // binarySearch массив должен быть отсортированным

        int index = Arrays.binarySearch(array, 2);
        System.out.println("index " + index);


        System.out.println("================= Сравнение массивов на равентсво =============");

        int[] test = {0, 2, 1, 3};
        // System.out.println(array.equals(test)); для сравнения массивов метод equals НЕ ПОДХОДИТ

        boolean isArraysEquals = Arrays.equals(array, test);
        System.out.println(isArraysEquals);

        System.out.println("=============================================");
        //находит и возвращает индекс первого различия между массивами

        int mismatchIndex = Arrays.mismatch(array, test);
        System.out.println(mismatchIndex);


        System.out.println("===============Многомерные массивы==================");

        int[][] arrayD = new int[3][4];
        // System.out.println(Arrays.toString(arrayD)); // такая запись течатает ссылки
        // возвращает строковое представление массива включая вложенные массивы
        System.out.println(Arrays.deepToString(arrayD));


        //сравнение многомерных массивов

        int[][] arrayC = new int[3][4];
        boolean isEquels = Arrays.deepEquals(arrayC, arrayD);
        System.out.println(isEquels);
        arrayC[0][3] = 1;
        arrayC[2][2] = 5;
        System.out.println(Arrays.deepToString(arrayC));
        boolean isEquels2 = Arrays.deepEquals(arrayC, arrayD);
        System.out.println(isEquels2);


        System.out.println("======================= copeOf===================");
        /* создает новый массив заданной длины. При этом копирует элементы из старого массива
        количество копируемых элементов равно длине массива
                если длина нового массива больше чем старого, оставшиеся ячейки заполняются значениями по умолчанию
*/

        int[] copyOfTest = Arrays.copyOf(test, 10);
        System.out.println(Arrays.toString(copyOfTest));
        copyOfTest = Arrays.copyOf(copyOfTest, 2);
        System.out.println(Arrays.toString(copyOfTest));

        System.out.println("\n=======================copyOfRange===================");

        // создает новый массив и записывает в него значения от индекса from до индекса to. последний индекс не включается

        int[] ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int[]rangeFromInts = Arrays.copyOfRange(ints, 3, 10);
        System.out.println("Arrays.toString(rangeFromInts" + Arrays.toString(rangeFromInts));

        // получить новый массив со значениями "старого массива"

        int[] copyOfInts = Arrays.copyOf(ints, ints.length);
        System.out.println("Arrays.copyOf(ints, ints.length)" + Arrays.toString(copyOfInts));

        copyOfTest = Arrays.copyOfRange(ints, 0, ints.length);
        System.out.println("Arrays.copyOfRange(ints, 0, ints.length " + Arrays.toString(copyOfTest));

        System.out.println("\n =========== Sastem.arraycopy ==============");




    }

}
