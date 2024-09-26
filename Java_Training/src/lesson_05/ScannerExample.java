package lesson_05;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in );

        System.out.println("Введите ваше имя:");
        String name = scanner.nextLine();


        //прочитать целое число

        System.out.println("Введите ваш возраст: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // СКУШАТЬ ОСТАТОК СТРОКИ

        System.out.println("Введите ваш рост: ");
       //  int height = scanner.nextInt();

        double height1 = scanner.nextDouble();




        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
        System.out.println("Height is " + height1);

    }
}
