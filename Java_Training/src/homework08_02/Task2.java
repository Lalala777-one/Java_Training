package homework08_02;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
       int i1 = random.nextInt(101);
       int i2 = random.nextInt(101);
       int i3 = random.nextInt(101);
       int i4 = random.nextInt(101);

        System.out.println(i1 + " | " + i2 + " | " + i3 + " | " + i4);

       int max = i1;
       if(i2 > max){ max = i2;}
       if (i3 > max){max = i3;}
       if (i4 > max){max = i4;}

        System.out.println("Max number is " + max);

    }
}
