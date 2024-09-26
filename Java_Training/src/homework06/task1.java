package homework06;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 3: ");
        int number = scanner.nextInt();
        if (number ==  1 ){
            System.out.println("Введенно число один");
        } else if (number == 2){
            System.out.println("Введенно число два");
        }
        else {
            System.out.println("Введенно число три");
        }




    }
}
