package lesson_05;

public class StringExample {
    public static void main(String[] args) {
        String string = "Hello, ";
        System.out.print(string);

        String string1 = new String("Java");
        System.out.println(string1);

        //  length    // метод позволяет получить количество символов в строке

       int length = string.length();
       System.out.println("Length is " + length);

        // toUpperCase   // метод позв перевести все символы в верхний регистр

        System.out.println(string.toUpperCase());


        // String иммутабельна (неизменна)
        // Если я хочу сохранить результат работы метода - я должна сохранить его в какую-то переменную


        String stringToUpper = string.toUpperCase();

        System.out.println("String: " + stringToUpper);


        // toLowerCase   // метод позволяющий перевести все символы в нижний регистр

        System.out.println(string.toLowerCase());
        stringToUpper = stringToUpper.toLowerCase();

        System.out.println(stringToUpper);

        String st1 = "One";
        String st2 = " ";
        String st3 = "hello";

         //  различные варианты конкатенации (склеивание / объединение) строк

        // конкатенация

        String concatSTR = st1 + st2 + st3;
        System.out.println("concatSTR: " + concatSTR);

        // контатенация vs мат. операция сложения

        System.out.println(1 + 3);
        System.out.println(1 + 3 + ":" + 2 + 3 );  // результат  4 : 23
        System.out.println(1 + 3 + ":" + (2 + 3) );  // результат 4 : 5


        String conCatStr2 = st1.concat(st2);
        conCatStr2 = conCatStr2.concat(st3);
        System.out.println(conCatStr2);


        // цепочка методов

        String conCatstr3 = st1.concat(st2).concat(st3).concat("!");
        System.out.println("Concatstr3: " + conCatstr3);


        // конкатенация 3      метод join  (сначала пишем разделитель, а потом через запятую переменные, либо слова в "")
        // one, hello, java  > one hello java

        String concatStr4 = String.join(" ", st1, st3, "java");
        System.out.println("concatStr4" + concatStr4);


        // когда есть строка - знак "+" это знак конкатенацииб все типы данных преобразуются в строки

        String digits = "0123456789";
        System.out.println(digits.length());

        // взять симвоз из строки по его индексу

        char firstchar = digits.charAt(0);
        System.out.println(firstchar);
        System.out.println(digits.charAt(4));

        // Независимо от фактической длины строки, индекс последнего символа ВСЕГДА будет равен (длина - 1)

        char lastChar = digits.charAt(digits.length() - 1);
        System.out.println("lastChar " + lastChar);


        // выделение подстроки, начиная с отпределенного индекса до конца строки

        String subString = digits.substring(2);
        System.out.println("subString " + subString);


        String subString2 = digits.substring(2, 7);  // по 7 индекс НЕ ВКЛЮЧИТЕЛЬНО
        System.out.println("subString2 " + subString2);





    }
}
