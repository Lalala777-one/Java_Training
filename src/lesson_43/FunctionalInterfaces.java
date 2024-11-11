package lesson_43;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaces {

    public static void main(String[] args) {
        /*
        Consumer<T> - выполняет операцию над объектом типа Т, не возвращая никакого результата
        Метод:
        void accept(T t)
         */

        Consumer<String> example = new Consumer<String>() {   // анонимный класс
            @Override
            public void accept(String string) {
            }
        };

        Consumer<String> printConsumer = str -> System.out.println(str); // на лямбда выражении
        printConsumer.accept("Hello World");
        printConsumer.accept("Java");

        System.out.println("============================\n");

        // составной интерфейс
        Consumer<String> consumer1 = str -> System.out.println("1. " + str.length());
        Consumer<String> consumer2 = string -> System.out.println("2. " + string + "!");

        Consumer<String> resultConsumer = consumer1.andThen(consumer2);
        resultConsumer.accept("Test");

        System.out.println("======================== Predicate ==========================\n");

        /*
        Predicate<T> - функция которая приниает объект типа Т и возвращает булиевое значение.
        Проверка объекта на соответствие условию
        Основной метод:
        boolean test(T t) - абстрактный метод


        and()  логическое И
        or()
        negate()
         */

        Predicate<String> stringPredicate = new Predicate<String>() { // реализация на анонимном классе
            @Override
            public boolean test(String string) {
                return false;
            }
        };

        //Проверяет что строка не пустая

        Predicate<String> isNotEmpty = str -> !str.isEmpty(); // если пуста строка false, если не пустая - true

        boolean result = isNotEmpty.test("Hello World");
        System.out.println(result);
        System.out.println("isNotEmpty.test(\"\") " + isNotEmpty.test(""));

        // Метод возвращающий список всех элементов удовлетвор условию

        List<Integer> numbers = new ArrayList<>(List.of(23, -1, 16, -17, 4, 2, 79, -45, 22));

        // Список всех отрицательных чисел (ИССПОЛЬЗУЯ УНИВЕРСАЛЬНЫЙ МЕТОД filterByPredicate )

        List<Integer> res1 = filterByPredicate(numbers, i -> i < 0);
        System.out.println(res1);

        // список всех положительных чисел (ИССПОЛЬЗУЯ УНИВЕРСАЛЬНЫЙ МЕТОД filterByPredicate )
        List<Integer> resPlus = filterByPredicate(numbers, i -> i >= 0);
        System.out.println(resPlus);


        // список чисел от 10 до 30
        List<Integer> resInterval = filterByPredicate(numbers, i -> i >= 10 && i <= 30);
        System.out.println("Список в интервале от 10 до 30 : " + resInterval);


        // список всех четных элементов списка. остаток от дел на 2 = 0
        List<Integer> evenList = filterByPredicate(numbers, i -> i % 2 == 0);
        System.out.println("Все четные числа из списка: " + evenList);


        // список всех НЕ четных элементов списка.
        List<Integer> oddList = filterByPredicate(numbers, i -> i % 2 != 0);
        System.out.println("Все не четные числа из списка: " + oddList);

        // and(Predicate<T>)

        Predicate<String> isLengthGreat6 = str -> str.length() > 6;
        Predicate<String > isContainsJava = str -> str.contains("Java");
        String test = "Java!";
        Predicate<String> combineString = isLengthGreat6.and(isContainsJava);
        System.out.println("combineString.test(test) : " + combineString.test(test));

        Predicate<String> combineStringOr = isLengthGreat6.or(isContainsJava);
        System.out.println("combineString.test(test) : " + combineString.test(test));



        System.out.println("=================== Function ======================");

        /*
        Function<T, R> - производит операцию над объектом Т, результат возвращает типа R (другого типа(но может и совпадать))
        R apply (T t)
         */

        Function<String, Integer> integerFunction = new Function<String, Integer>() {
            @Override
            public Integer apply(String string) {
                return 0;
            }
        };

        // принимает String, возвращает int - длину строки
        Function<String, Integer> function = string -> string.length();
        int length = function.apply("Hello, World");
        System.out.println("function.apply(\"Hello, World\" : " + length);

        //Function<String, String> toUpperCase = str -> str.toUpperCase();
        Function<String, String> toUpperCase = String::toUpperCase; // то же самое что и с строке 108
        System.out.println(toUpperCase.apply("Test string"));

        Function<String, String> concatenate = FunctionalInterfaces::test;
        String result1 = concatenate.apply("Hello World");
        System.out.println(result1);

        // Todo
        // Function<String , String> combine = toUpperCase.andThen();
    }


    public static String test(String str){
        return str + "!!!";
    }


    // Метод возвращающий список всех элементов удовлетвор условию (какому угодно условию!!!!) УНИВЕРСАЛЬНЫЙ МЕТОД
    public static List<Integer> filterByPredicate(List<Integer> integers, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer integer : integers) {
            if (predicate.test(integer)) {
                result.add(integer);
            }
        }
        return result;
    }


}
