package homework08_02;

import java.util.Scanner;

public class Task1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число 1, 2 или 3");
            int input = scanner.nextInt();
            scanner.nextLine();

            if(input == 1){
                System.out.println("One");
            }  else if  (input == 2){
                System.out.println("Two");
            } else if (input == 3) {
                System.out.println("Three");
            }else {
                System.out.println("Incorrect number");
            }
        }
    }
class Task011{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1, 2 или 3");
        int input = scanner.nextInt();
        scanner.nextLine();

        switch (input){
            case 1:
                System.out.println("Вы ввели один");
                break;
            case 2:
                System.out.println("Вы ввели два");
                break;
            case 3:
                System.out.println("Вы ввели три");
                break;
            default:
                System.out.println("Я таких чисел не знаю");
        }
    }
}
