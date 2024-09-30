package MyTests;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int nummer = scanner.nextInt();
        if ((nummer % 2) == 0){
            System.out.println("Число чётное");
        }
        else {
            System.out.println("Число нечётное");
        }
    }
}
