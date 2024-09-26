package homework07;

import java.util.Random;
import java.util.SortedMap;

public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();
        int gradeMath = random.nextInt(13);

        System.out.println("Оценка за контрольную работу по математике: " + gradeMath);

        int timeRemaining = 45;

        switch (gradeMath) {
            case 0:
            case 1:
            case 2:
                timeRemaining = 0;
                System.out.println("Больше никакого TV сегодня");
                break;
            case 3:
                timeRemaining -= 30;
                System.out.println("Я очень растроенна результатом");
                break;
            case 4:
            case 5:
            case 6:
                timeRemaining += 15;
                System.out.println("Ты неплохо справился");
                break;
            case 7:
            case 8:
            case 9:
                timeRemaining += 45;
                System.out.println("Хорошая работа, ты очень старательный");
                break;
            case 10:
            case 11:
            case 12:
                timeRemaining += 60;
                System.out.println("Ты большой молодец, хорошо постарался");
                break;

        }

        if (timeRemaining > 45) {  // 45 минут, так как изначально 15 мин уже было просмотренно ребенком
            timeRemaining = 45;
        }
        System.out.println("Оставшееся врямя для просмотре TV: " + timeRemaining );

    }
}


