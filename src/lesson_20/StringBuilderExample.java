package lesson_20;

import java.util.Scanner;

public class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Hello");

        // метод для добавления в конец строки (приклеить что то справа)

        sb1.append(" ").append("Java");

        System.out.println(sb1);

        // получить строковое представление

        String string = sb1.toString();
        System.out.println(string);

        // вставить символы в указанную позицию

        StringBuilder sb2 = new StringBuilder("Hello World");

        sb2.insert(6, "beautiful ");
        System.out.println(sb2);

        // заменить подстроку (определяется индексами) на указанное значение

        StringBuilder sb3 = new StringBuilder("Hello World");
        sb3.replace(6, 11, "Java");
        System.out.println(sb3);

        // удалить подстроку в диапазоне от start до end

        StringBuilder sb4 = new StringBuilder("Hello World");
        sb4.delete(5, 11);
        System.out.println(sb4);

        // реверс (разворачивает последовательность символов)
        StringBuilder sb5 = new StringBuilder("Hello World");
        sb5.reverse();
        System.out.println(sb5);


        //количество символов , длина

        System.out.println("sb5.length() " + sb5.length());

        // получить символ по индексу

        char ch = sb5.charAt(3);
        System.out.println(ch);

        // получить подстоку , в String

        sb1 = new StringBuilder("Hello World");

        String substring = sb1.substring(1);
        System.out.println("sb1.substring(1) " + substring);

        substring = sb1.substring(6, 9);
        System.out.println("sb1.substring(6, 9) " + substring);

        // изменить размер последовательности символов, можно увеличить или уменьшить количество символов

        sb1 = new StringBuilder("Hello");
        sb1.setLength(10);  // заполняет нулями
        System.out.println("sb1.setLength(10) " + sb1);
        char ch1 = sb1.charAt(8);
        System.out.println("sb1.charAt(8) " + (int)ch1);


/*
Написать метод который запрашивает у пользователя строку состоящую из нескольких слов
и возвращающий абревиатуру этой фразы (первые буквы каждого слова записанные в верхнем регистре)
 */

        String result = phraseString();
        System.out.println("Абревиатура: " + result);

        // Потоко безопасный брат StringBuilder. применяется когда идет работа с многопоточностью

        StringBuffer stringBuffer = new StringBuffer();


    }

    public static String phraseString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку из нескольких слов");
        String input = sc.nextLine();
        String[] words = input.split(" ");  //

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            sb.append(word.charAt(0));


        }
        return sb.toString().toUpperCase();
    }
}
