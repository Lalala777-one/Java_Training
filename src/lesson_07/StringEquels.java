package lesson_07;

public class StringEquels {
    public static void main(String[] args) {

        int x = 10;

        String str1 = "Java";
        String str2 = "Java";
        String str3 = "JaVa";
        String str4 = new String("Java");

        System.out.println(str1 + " | " + str2 + " | " + str3 + " | " + str4);

        boolean b1 = (str1 == str2);
        System.out.println("str1 == str2 " + str1 == str2); // true
        System.out.println("str1 == str3 " + str1 == str3); // false
        System.out.println("str1 == str4 " + str1 == str4); // false


        // для сравнения строк по из значению нужно использовать метод equels
        // МЕТОД ДЛЯ СРАВНЕНИЯ СТРОК ПО ЗНАЧЕНИЯМ

        boolean b2 = str1.equals(str2);
        System.out.println("str1.equels(str2) " + str1 == str2);
        System.out.println("str1.equels(str4)" + str1.equals(str4));

        // МЕТОД ДЛЯ СРАВНЕНИЯ ДВУХ СТРОК ИГНОРИРУЯ РЕГИСТР БУКВ

        System.out.println( " str1.equalsIgnoreCase(str3) "+ str1.equalsIgnoreCase(str3)); //true




    }
}
