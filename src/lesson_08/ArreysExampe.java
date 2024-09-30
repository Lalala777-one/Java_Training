package lesson_08;

import java.util.Random;

public class ArreysExampe {
    public static void main(String[] args) {
        int [] arrays; // ОБЪЯВЛЕНИЕ массива целых чисел
        String [] strings;   // объявление массива строк

        int array1 []; // альтернативный способ объявления массива НЕ РЕКОМЕНДУЕТСЯ


        arrays = new int[4]; // ИННИЦИАЛИЗИРОВАЛИ массив типа int с 4мя ячейками
        strings = new String[10]; // инициализировали массив типа String с 10ю ячейками



        int [] arrays3 = new int[8]; // объявление и инициализация массива int с 8 ячейками
        boolean[] boolar = new boolean[6];
        /*
        ЗНАЧЕНИЯ ПО УМОЛЧАНИЮ

        1. ДЛЯ ВСЕХ ЧИСЛОВЫХ ТИПОВ (в том числе тип char) это будет 0 (0.0)
        2. ДЛЯ boolean - false
        3. ДЛЯ ВСЕХ ССЫЛОЧНЫХ ТИПОВ ДАННЫХ - null (null - ничто)
         */


        int value = arrays3[0]; // получить из массива значение, находящееся в ячейке с интексом 0

        System.out.println("Value: " + value);

        System.out.println("arrays[3] " + arrays[3]);

        System.out.println("strings[3] " + strings[3]);

        System.out.println( "boolar[1] "+ boolar[1]);

    // распечатать все значения в массиве таким способом НЕ ПОЛУЧИТСЯ
        System.out.println("arrays: " + arrays3); // получим ссылку на адрес в ячейке памяти в Heap (куче)


        // явная инициализация массива

        int[] numbers = new int[] {45, 56, -16, 0, 159};
        int[] ints = {-10, 54, 12234, 444};

        int val = numbers[0];
        System.out.println("val: " + val);
        System.out.println("numbers[4] : " + numbers[4]);


        // присвоение нового значение ячейке с индексом 2

        numbers[2] = 100;

        //
        System.out.println("Вывести все значения массива");
        int j = 0;
        while (j < numbers.length){
            System.out.print(numbers[j] + "; ");
            j ++;
        }
        // создать массив на 10 элементов и заполнить его случайными чеслами от 0 до 100

        Random random = new Random();
        int[] nums = new int[10];
        int k = 0;

        System.out.print("[");
        while (k < nums.length){
            nums[k] = random.nextInt(101);
            System.out.print(nums[k] + ", ");
            k++;
        }
        System.out.println("]");




// нахождение минимума из массива при помощи цикла

        int min = nums[0];
        int i = 0;
        while (i < nums.length){
            if (nums [i] < min){
                min = nums[i];
            }
            i ++;
        }
        System.out.println("Минимальное число в массиве: " + min);


    }
}
