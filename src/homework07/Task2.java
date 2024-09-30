package homework07;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        int i1 = random.nextInt(101);
        int i2 = random.nextInt(101);
        int i3 = random.nextInt(101);
        int i4 = random.nextInt(101);

        System.out.println(i1 + " | " + i2 + " | " + i3 + " | " + i4);

        int min = i1;

        if (i2 < min){min = i2;}
        if (i3 < min){min = i3;}
        if (i4 < min){min = i4;}

        System.out.println("Minimum number: " + min);
    }

}
