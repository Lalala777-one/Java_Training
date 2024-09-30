package homework07;

import javax.xml.transform.Source;
import java.util.Random;
import java.util.SortedMap;

public class Task5_02 {
    public static void main(String[] args) {
        Random random = new Random();
        int note = random.nextInt(13);
        System.out.println("Оценка: " + note) ;

        int time = 45;
        switch (note){
            case 12:
            case 11:
            case 10:
                System.out.println("Как вы рады");
                time += 60;
                break;
            case 9:
            case 8:
            case 7:
                System.out.println("");
                time += 45;
                break;
            case 6:
            case 5:
            case 4:
                time += 15;
                System.out.println("Сойдет");
                break;
            case 3:
                System.out.println("плохо");
                time -= 15;
            case 2:
            case 1:
            case 0:
                time = 0;
                System.out.println("Никакого телевизора");
        }


        if (time > 60) time = 60;
        if (time < 0) time = 0;

        System.out.println("Остаточное время на сегодня: " + time);
    }
}
