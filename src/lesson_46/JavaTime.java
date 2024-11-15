package lesson_46;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.SortedSet;

public class JavaTime {


    public static void main(String[] args) {

        // LocalDate - представляет дату ( в формате год, месяц и день) ,  (без времени и часового пояса)
        LocalDate date = LocalDate.now();
        System.out.println("now: " + date);


        // посмотреть какая дата будет завтра (через какое то количество дней)
        LocalDate tomorrow = date.plusDays(1);  // МЕТОДА plusDays
        System.out.println("tomorrow " + tomorrow);

        // объект LocalDate неизменяем. Метод plusDays не изменяет объект, на котором он вызван (date_)

        System.out.println("date " + date);

        // МЕТОД plusWeeks  плюс 4 недели к дате
        System.out.println(date.plusWeeks(4));

        // Method minusDays минус 1 день
        System.out.println("yesterday " + date.minusDays(1));

        // Установить дату LocalDate.of Приминает год, месяц, день
        LocalDate date1 = LocalDate.of(2022, 2, 15);
        System.out.println("date1 " + date1);

        // Можно использовать Enum с названием месяца   Month.
        LocalDate date2 = LocalDate.of(2002, Month.FEBRUARY, 15);
        System.out.println("date2: " + date2);

        // У объекта LocalDate есть много геттеров
        // getYear() - возвращает int
        System.out.println("year: " + date2.getYear());

        // getMonth() месяц в формате Enum
        System.out.println("Month: " + date2.getMonth());

        // getMonthValue() получить год в виде цифры
        System.out.println("Месяц в цифре: " + date2.getMonthValue());

        // получить день месяца getDayOfMonth()
        System.out.println("date2.getDayOfMonth(): " + date2.getDayOfMonth());

        // получить день нелели недели в формате Enum
        System.out.println("date2.getDayOfWeek(): " + date2.getDayOfWeek());

        DayOfWeek dayOfWeek = date2.getDayOfWeek();
        System.out.println("номер дня нелели " + dayOfWeek.getValue()); // получим номер дня недели

        // получить день года в int
        System.out.println("date2.getDayOfYear(): " + date2.getDayOfYear());

        // получить инфу количество дней в месяце

        // date2.lengthOfMonth()
        System.out.println("Сколько дней в месяце " + date2.lengthOfMonth());

        // date2.lengthOfYear()
        System.out.println("Сколько дней в году " + date2.lengthOfYear());

     /*
        Month[] months = Month.values();
        for (Month month : months){
            System.out.println(month);
        }
      */

        String dateString = "1993-12-18"; // Формат строки ISO-8601 - (год, месяц, число разделенные тиру)

        LocalDate date3 = LocalDate.parse(dateString); // на выходе получим LocalDate

        System.out.println(date3.getDayOfMonth() + ":" + date3.getMonthValue() + ":" + date3.getYear() + ":" + date3.getDayOfWeek());


        System.out.println("===================LocalTime=================================");
        // LocalTime - представляет время (часы, минуты, секунды, наносекунды)
        LocalTime time = LocalTime.now(); // возвращает текущее время
        System.out.println("LocalTime.now(): " + time);

        LocalTime time1 = LocalTime.of(21, 33); // часы, минуты
        time1 = LocalTime.of(21, 22, 44);
        time1 = LocalTime.of(21, 22, 44, 54875);

        System.out.println("time1: " + time1);

        // Методы для изменения

        // добавить какое.то количество часов
        System.out.println("\"time.plusHours\" " + time.plusHours( + 1)); // получаем новый объект

        // добавляем минуты
        System.out.println("time.plusMinutes(65) : " + time.plusMinutes(65));

        // отнять секунды
        System.out.println("(time.minusSeconds(30) : " + time.minusSeconds(30));



        //
        //
        // ГЕТТЕРЫ

        System.out.println(time.getHour() + ":" + time.getMinute() + ":" + time.getSecond() + ":" + time.getNano()); // все в int


        // парсер
        String timeString = "12:13:46";
        // формат ISO 9601 ("2001-01-14T08:15:45+01.00")

        LocalTime parsTime = LocalTime.parse(timeString);
        System.out.println(parsTime + " : " + parsTime.getMinute());


        System.out.println("=======================LocalDateTime===========================");
        // LocalDateTime представляет дату и время без учета часового пояса

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime: " + localDateTime);



        LocalDate localDate = LocalDate.of(2011, Month.AUGUST, 15);
        LocalTime localTime = LocalTime.of(15, 31, 59);
        LocalDateTime dateTime = LocalDateTime.of(localDate, localTime); // получить LocalDateTime из LocalDate +  LocalTime

        System.out.println(dateTime);

        dateTime = LocalDateTime.of(2024, 12, 31, 23, 59);
        System.out.println(dateTime.getDayOfWeek()); // прописными
        System.out.println(dateTime.getDayOfWeek().getValue()); //  в виде номера дня недели


        // Есть все методы из классов LocalDate и LocalTime

        System.out.println("dateTime.plusHours(1) : " + dateTime.plusHours(1)); // работаю как с time
        System.out.println("dateTime.minusYears(1) : " + dateTime.minusYears(1));// работаю как с date


        System.out.println("========================ZoneDateTime===================================");
        //ZoneDateTime  представляет дату и время с часовым поясом

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime + " | " + zonedDateTime.getZone());

        System.out.println("\n ==== isAfter, isBefore, until, equals======");

        LocalDate date4 = LocalDate.of(2000, 10, 15);
        LocalDate date5 = LocalDate.of(2000, 6, 25);

        // isAfter, isBefore, until, equals есть у всех объектов, представляющих дату и/ или время
          // isAfter - проверяет что текущий объект после (позже) указанного объекта

        boolean isAfter = date4.isAfter(date5);
        System.out.println("date4.isAfter(date5) :" + isAfter);

        // isBefore - проверяет что текущ объект до (раньше) указанного объекта
        System.out.println("date4.isBefore(date5) : " + date4.isBefore(date5));


        // equals - проверяет объект даты и/или времени на равенство

        System.out.println("date4.equals(date5) : " + date4.equals(date5));


        // until - метод измеряет время между текущим и указанным объектом даты/времени
        // мы можем выбрать в каких единицах измерять разницу
        // возвращает long

        long daysBetween = date4.until(date5, ChronoUnit.DAYS);
        System.out.println("daysBetween: " + daysBetween);

        LocalDateTime dateTime1 = LocalDateTime.now();
        LocalDateTime dateTime2 = dateTime1.plusDays(15);
        System.out.println(dateTime2.until(dateTime1, ChronoUnit.SECONDS));

        // УНИВЕРСАЛЬНЫЕ МЕТОДЫ minus, plus  - применяются ко всем объектам даты/времени

        LocalDateTime dateTime3 = dateTime1.minus(10, ChronoUnit.DAYS); // вычесть из даты 10 дней
        LocalDateTime dateTime4 = dateTime1.plus(5, ChronoUnit.YEARS); // прибавить 5 лет

        // метод between есть у каждого ChronoUnit
        // если мне нужно узнать количество дней между датами
        long daysBetween2 = ChronoUnit.DAYS.between(dateTime3, dateTime4);
        System.out.println("ChronoUnit.DAYS.between(dateTime3, dateTime4): " + daysBetween2);

        System.out.println(ChronoUnit.HOURS.between(dateTime3, dateTime4));


        System.out.println("\n ============ Duration, Instant, Period ========================\n");

        /*
        Duration - представляет продолжительность в секундах и наносекундах. Может высчитать разницу между двумя объектами Instant
        Instant - сколько прошло наносекунд по временной шкале григорианского календаря (с 1 января 1970 UTC )
        Period - представляет период времени в годах, месяцах и днях между двумя объектами дат
         */


        System.out.println("\n ================= DateTimeFormatter ======================");

        // DateTimeFormatter отвечает за форматирование даты и времени
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter  formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String formattedDate = now.format(formatter); // вернется String
        System.out.println("formattedDate: " + formattedDate);

        /*
        y  - год
        M  - месяц
        d  - день

        H -  час в фотмате от 0 до 23
        h -  час в формате от 0 до 12 , флаг а  для отображения AM / PM
        m - минута
        s - секунда

        Количество повторений символа определяет формат
        yy - двухзначный год, например 24 для 2024 года
        yyyy - четырехзначный год

        M - месяц "2" или "12"
toDo
        MM - месяц в формате "02" или "12"
        также происходит с часами, днями

        d - однозначный или двузначный день : 3 или 29
        dd - двузначный день 03 или 29

         */



    }

}
