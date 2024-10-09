package homework_19;

public class Task4 {
    /*
   Напишите метод printMessage(final String message), который выводит сообщение на экран.
   Попробуйте изменить значение параметра message внутри метода.
•	Объясните результат и поведение компилятора.
     */

    private static void printMessage(final String message){
        System.out.println(message);

       /* message = message + "Hello World";

       переменная message объявленна final, что означает что мы не можем его изменить после того как она передана
       в метод.
       внутри метода значение параметра final останется неизменным. Поэтому при попытке присвоить новое значение
       компилятор не позволит это сделать и выдаст ошибку.

        */


    }
}
