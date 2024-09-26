package lesson_07;

public class Block {
    public static void main(String[] args) {

        int x = 10;

        {
            int y = 5;
            x = x + y;

            System.out.println("x " + x);
            System.out.println("y " + y);
        }

       // x = x + y; // переменная у не доступна вне своего блока

        // новая переменная с именем у
        int y = 124;



    }
}
