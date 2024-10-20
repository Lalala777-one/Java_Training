package lesson_27;

public class PersonApp {
    public static void main(String[] args) {

        Person person1 = new Person("email", "2345");
        System.out.println(person1);

        person1.setEmail("ala@gmail.com");
        System.out.println(person1);
        person1.setEmail("@gmail.com");
        person1.setPassword("Na5!12356h");
        System.out.println(person1);



      /*  Person person = new Person("email", "password");

        System.out.println(person.toString());

        System.out.println(Character.isAlphabetic('c'));
        // Возвращает true если символ цифра
        System.out.println(Character.isDigit('v'));

        System.out.println(Character.isLetter('c'));
        System.out.println(Character.isLetterOrDigit('-'));

       */
    }
}
