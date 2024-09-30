package Lesson_10;

import java.util.Random;

public class MethodWithReturn {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int sum = sum(a, b);
        System.out.println(sum);

        System.out.println(squareNumber(2.5));
        double var = squareNumber(4.0);
        System.out.println("var " + var);

        String concat = concatStr("Java", 17);
        System.out.println("concat" + concat);

        int[] ints = fillArray();
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println();
    }

    // метод создает массив интов на 10 элтов заполн случ значениями

    public static int[] fillArray(){
        int[] result = new int[10];
        Random random = new Random();
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(101);

        }
        return result;
    }

    public static String concatStr (String str, int i){
        String result = str + i + "!!!";
        return result;
    }

    public static int sum (int x, int y){
        int result = x + y;
        return result;
    }

    public static double squareNumber (double number){
        return number * number;
    }
}
