package homework_06;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String string = "Programming is fun";

        boolean result = string.contains("fun");
        System.out.println("Result is " + result);
    }
}

class Task2 {
    public static void main(String[] args){
        Random random = new Random();

        int rand1 = random.nextInt(51);
        int min = - 20;
        int max = 30;
        int rand2 = random.nextInt(max - min + 1) + min;

        System.out.println("rand1 = " + rand1);
        System.out.println("rand2 = " + rand2);

        boolean b1 = rand1 == rand2;
        boolean b2 = rand1 != rand2;
        boolean b3 = rand1 > rand2;
        boolean b4 = rand2 < rand1;


        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
        System.out.println("b4 = " + b4);


}

class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите челое число");
         int input = scanner.nextInt();
         boolean bol1 = input % 2 == 0;
         boolean bol2 = input % 3 == 0;
         boolean bol3 = bol1 & bol2;

        // System.out.println("Число: " + input + "; чётное: " + bol1 + "; кратно 3: " + bol2 + "; четное и кратное 3: " + bol3);

        //printf();
        // %d - целое число
        // %f - число с плавабщей точкой
        // %s - строка
        System.out.printf("Число: %d; чётное: %s; кратно 3: %s; четное и кратное 3: %s\n", input, bol1, bol2, bol3);
        System.out.printf("Test");
    }
}}


//* Task4
// Result1 = true  (11 > 10 -> true)
// Result2 = true  (5 == 5 -> true)
// Result3 = false  (24 != 24 -> false)
// Result4 = true  (2 >= 2 -> true)
// Result5 = false
// (a % b == 2 )   -> ( 2 == 2 ) - это true   != от true  это false -  итого результат false


