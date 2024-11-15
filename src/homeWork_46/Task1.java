package homeWork_46;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Task1 {
    /*
    Task 1
Получить и вывести на экран:
текущую дату
текущий год, месяц и день
Создать дату, например Ваш день рождения и вывести на экран
Создать две даты и проверить на равенство
Получить и вывести на экран:
текущее время
текущее время + 3 часа
Создать дату:
которая на неделю позже сегодняшней
которая была на год раньше сегодняшней используя метод minus
которая на год позже сегодняшней
tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
     */

    public static void main(String[] args) {
        // текущую дату
        LocalDate todayDate = LocalDate.now();
        System.out.println(" Today is " + todayDate);

        // Создать дату, например Ваш день рождения и вывести на экран

        LocalDate birthdayDate = LocalDate.of(1993, 12, 18);
        System.out.println("birthdayDate: " + birthdayDate);

        // Создать две даты и проверить на равенство

        LocalDate localDate1 = LocalDate.of(2022, 12, 24);
        LocalDate localDate2 = LocalDate.of(2022, 11, 22);
       if(localDate1.equals(localDate2)){
           System.out.println(localDate1 + " | " +  localDate2 + " : the two dates are equal.");
       }else {
           System.out.println(localDate1 + " | " +  localDate2 + " :  The two dates are not equal.");
       }


        LocalDate inOneWeek = todayDate.plus(1, ChronoUnit.WEEKS);
        System.out.println("The date in a week will be: " + inOneWeek); // которая на неделю позже сегодняшней

        LocalDate dateOneYearAgo = todayDate.minus(1, ChronoUnit.YEARS);
        System.out.println("The date one year ago was: " + dateOneYearAgo); // которая была на год раньше сегодняшней используя метод minus

        LocalDate dateOneYearFromNow = todayDate.plusYears(1); // которая на год позже сегодняшней
        System.out.println("The date in one year will be: " + dateOneYearFromNow);

        // tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
        LocalDate yesterday = todayDate.minusDays(1);
        System.out.println("Yesterday was: " + yesterday);

        LocalDate tomorrow = todayDate.plusDays(1);
        System.out.println("Tomorrow will be: " + tomorrow);

        System.out.println("yesterday.isBefore(todayDate): " + yesterday.isBefore(todayDate));
        System.out.println("yesterday.isAfter(todayDate): " + yesterday.isAfter(todayDate));
        System.out.println("tomorrow.isBefore(yesterday) : " + tomorrow.isBefore(yesterday));
        System.out.println("tomorrow.isAfter(todayDate): " + tomorrow.isAfter(todayDate));

        System.out.println("tomorrow.isAfter(yesterday): " + tomorrow.isAfter(yesterday));
        System.out.println("tomorrow.isBefore(yesterday): " + tomorrow.isBefore(yesterday));


       /*
       Получить и вывести на экран:
текущее время
текущее время + 3 часа
        */

        LocalTime timeNow = LocalTime.now();
        System.out.println("Time now: " + timeNow);
        System.out.println("\"Time in 3 hours\" : " + timeNow.plus(+ 3, ChronoUnit.HOURS)); //

    }

}
