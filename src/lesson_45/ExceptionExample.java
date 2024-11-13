package lesson_45;

import java.net.MalformedURLException;
import java.net.URL;

public class ExceptionExample {
    public static void main(String[] args) throws MalformedURLException {

        // System.out.println(1 / 0); // java.lang.ArithmeticException

        int[] array = {1, 2, 4};
      //  array[10] = 100; // java.lang.ArrayIndexOutOfBoundsException

        String str = null;
       // str.length(); //  java.lang.NullPointerException

       /*
        МЕХАНИЗМ ОБРАБОТКИ ИСКЛЮЧЕНИЙ
        try {
            // код, который может вызвать исключение
        } catch(Exception ex ) {
            // код обработки исключения
        } finally{
        // код который выполнится в любом случае
        }
        */

        String url = getUrString();
        System.out.println(url);

       // уже здесь нужна обработка исключения
        String url1 = getUrlString2();
        System.out.println(url1);

        String url2 = null;
        try {
            url2 = getUrlString2();

        }catch (MalformedURLException e ){
            System.out.println(e.getMessage());
        }
        System.out.println(url2);

    }// main

    // ключевое слово throws используется в сигнатуре метода, для указания, что метод может выбросить исключение
    private static String getUrlString2() throws MalformedURLException {
        URL myUrl = null;
        String defaultUrl = "http://google.com";

        myUrl = new URL(defaultUrl);
        myUrl = new URL("https://google.com");

        return myUrl.toString();

    } // getUrlString2


    private static String getUrString (){
        URL myUrl = null;
        try {
             myUrl = new URL("https://google.com"); // как только в блоке try возвникает исключение, дальнейшие строчки не выполняются
            System.out.println("Next line code");
        }catch (MalformedURLException exception ){
            System.out.println("Неверный формат URL" + exception.getMessage());
            System.out.println(exception.toString());
            System.out.println("===============");
            exception.printStackTrace();
            /*

            getMessage() - возвращает строку с коротким описанием исключения
            toString() - Строковое представление исключения
            printStackTrace() - выводит трассировку исключения
             */
        }finally {
            // этот код вызовется после блока try / catch независимо будет Exception или нет
            System.out.println("Finnaly code");
        }

        return myUrl == null ? "null" : myUrl.toString(); // тернарный оператор

    }
}
