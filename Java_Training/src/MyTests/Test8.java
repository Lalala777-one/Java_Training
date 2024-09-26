package MyTests;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something what you want: ");
        String st1 = scanner.nextLine();
        System.out.println(st1.toUpperCase() );
        System.out.println(st1.strip());


    }

}
