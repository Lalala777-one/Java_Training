package homework_08;

import java.util.Random;


// задача на откусывание цыфр от числа в цикле

public class Task {
    public static void main(String[] args) {
        Random random = new Random();
        int rand = random.nextInt(11_000_000);
        System.out.println(rand);

        int sum = 0;

        while (rand > 0){
            int digit = rand % 10;
            rand /= 10;
            sum += digit;

            System.out.print(digit);

            if (rand > 0){
                System.out.print(" + ");
            }else {
                System.out.print(" = ");
            }

            System.out.print(sum);
        }
        System.out.println();
    }
}
