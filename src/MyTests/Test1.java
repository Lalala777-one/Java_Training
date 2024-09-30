package MyTests;

import java.util.Scanner;
import java.util.SortedMap;

public class Test1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int nummer1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int nummer2 = scanner.nextInt();

        System.out.println("Сумма чисел равна "+ (nummer1 + nummer2));


    }
}
