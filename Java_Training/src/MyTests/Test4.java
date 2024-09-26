package MyTests;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int nummer1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int nummer2 = scanner.nextInt();

        if (nummer1 > nummer2){
            System.out.println(nummer1);
        }
        else {
            System.out.println(nummer2);
        }

    }
}
