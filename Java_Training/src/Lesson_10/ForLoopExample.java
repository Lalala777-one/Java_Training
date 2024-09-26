package Lesson_10;

// 23.09.2024


import java.util.Random;

/*
for(<блок инициализации>; <блок проверок/ условие выхода>; <блок изменений>){
тело цикла
}
 */
public class ForLoopExample {
    public static void main(String[] args) {

        // вывести все числа от 0 до 10

        int i = 0;
        while (i <= 10){
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\nEnd while loop");


        for (int j = 0; j <= 10; j++){
            System.out.print(j + " ");
        }
        System.out.println("\nEnd for loop\n");

        for (i = 0; i <= 10; i++){
            System.out.print(i + " ");
        }
        System.out.println();


        // Мы можем инициализирвать несколько переменных в блоке инициализации
        // В блоке изменений мы также можем менять несколько переменных

        int k = 14;
        for ( int a = 0, f = 1; k >= 0 && f < 10; k--, a = ++a + k, f++){
            System.out.println(k + ": " + a + ": " + f);
        }

        // создать массив целых чисел случайной длины в диапазоне от 5 до 15
      //  заполнить массив случайными числами от -50 до +50


        Random random = new Random();
        int[] ints = new int[random.nextInt(11) + 5]; // получить случайную длину
        System.out.println("Длина массива: " + ints.length);

        System.out.print("[ ");

        for (int  j = 0;  j < ints.length;  j++) {
            ints[j] = random.nextInt(101) - 50; // (0...100) - 50 -> (-50 --- +50)
            System.out.print(ints[j] + (j < ints.length - 1 ? ", " : " ]\n"));
        }

        // continue, break операторы позволяющие управлять количеством итераций в цикле


        for (int j = 1; j < 7 ; j++) {

            if (j == 3) continue;  // continue  - прервать текущую итерацию и перейти к следующей итерации цикла
            // мы перейдем в блок изменения переменных, потом в блок проверки условия
            // в текущей итерации после continue все операторы в теле цикла будут пропущены
            System.out.print(j + " ");
        }
        System.out.println();

        for (int j = 1; j < 7 ; j++) {
            if(j == 3) break;// break заканчивает текущую итерацию цикла и весь цикл
            // все последующие операции выполнены не будут
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
