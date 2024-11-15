package homeWork_46;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Task2 {

    /*
    Написать метод, принимающий список из нескольких дат типа LocalDate
    и возвращающий количество дней между самой ранней и поздней датами в этом списке
     */

    public static void main(String[] args) {

        List<LocalDate> dateList = List.of(
                LocalDate.of(2024, 11, 14),
                LocalDate.of(2018, 05, 15),
                LocalDate.of(1993, 12, 18),
                LocalDate.of(2022, 03, 25)


        );

        System.out.println(getDaysBetweenFirstAndLastDate(dateList));

    }

    public static long getDaysBetweenFirstAndLastDate (List<LocalDate> days){
        if (days.isEmpty()) throw new IllegalArgumentException("The list of dates is empty. Cannot calculate the date difference.");

        LocalDate minDate = days.stream()
                .min(LocalDate :: compareTo)
                .orElseThrow();

        LocalDate maxDate = days.stream()
                .max(LocalDate::compareTo)
                .orElseThrow();

       return maxDate.until(minDate, ChronoUnit.DAYS);
    }
}
