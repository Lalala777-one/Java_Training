package lesson_43;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

        /*
         Stream api - инструмент, позволяющий обрабатывать наборы данных в декларативном стиле.

         Stream - поток данных, который представляет собой последовательность элементов. Поток предоставляет возможность
         поочередного получения элемента данных для обработки.
         Stream может быть создан из различных источников (массивы, коллекции и т.д)

        PipeLine - последовательность операций, выполняемых на потоке

        ПРОМЕЖУТОЧНЫЕ ОПЕРАЦИИ (методы) - Это операции, которые преобразуют поток в другой поток (возвращают поток). МОЖЕТ БЫТЬ МНОГО
        (БОЛЬШЕ ЧЕМ ОДНА)

        ТЕРМИНАЛЬНЫЕ ОПЕРАЦИИ (методы) - Это операции, которые ЗАПУСКАЮТ обработку потока и закрывают его.
        После выполнения терминальной операции поток перестает быть доступным для дальнейшей обработки
         может быть ТОЛЬКО ОДИН ТЕРМИНАЛЬНЫЙ МЕТОД

         ЛЕНИВЫЕ ВЫЧИСЛЕНИЯ -
         Стримы не выполняют промежуточные операции пока на потоке не будет вызван терминальный метод.



        КАК СОЗДАТЬ ПОТОК:
        stream() - создание потока из эл-тов коллекции

         */

        /*
        ПРОМЕЖУТОЧНЫЕ МЕТОДЫ:

        Stream(T t) filter (Predicate <T> predicate) - оставляет в потоке только те эл-ты которые удовлетворяют условию
        (для котор предикат вернет true) . Отбрасывает эл-ты не удовлетв условию.

        ==========

        sorted() - сортирует поток в естественном порядке
        sorted(Comparator <T> comparator) - будет сортировать поток с исспользованием компаратора

        Stream<R> map(Function<T, R> action) - преобразует элементы потока с использованием заданной функции
         */

        /*
        ТЕРМИНАЛЬНЫЕ МЕТОДЫ:

        R collect(Collector<T, A, R> collector) - преобразует эл-ты потока в разные типы коллекций или другие структуры данных


         */


        //task1();

        //task2();

       // task3();

      //  task4();

        task5();



    }// main

    private static void task5() {
        // получить список имен кошек чей вес больше 4 кг
        // создать поток
       // оставить кошек чей вес больше 4
            // изменить тип потока Cat -> name(String)

        List<Cat> cats = getListCts();

        List<String> catNames = cats.stream()
                .filter(cat -> cat.getWeight() > 4)
                .map(Cat :: getName)
                        .collect(Collectors.toList());

        System.out.println(catNames);
    }



    private static void task4() {
        List<Cat> cats = getListCts();
        // Получить список имен всех кошек

        // получаем поток элементов другого типа
        Stream<String>  namesStream = cats.stream()
                .map(cat -> cat.getName());

        List<String> catNames = cats.stream()
                .map(Cat::getName)
                .collect(Collectors.toList());

        System.out.println(catNames);

    }

    private static void task3() {

        List<Cat> cats = getListCts();

        // фильтрация кошек. Оставить котов с именем длиннее 4 символов

        Stream<Cat> stream = cats.stream()
                .filter(cat -> cat.getName().length() > 4);

        // Пока не запущен терминальный метод - промежуточные методы не выполняются
        List<Cat> longNameCats = stream.collect(Collectors.toList());

     }

    private static void task2() {
        List<Cat> cats = getListCts();

        // получить список кошек с весом больше 4 кг
        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() > 4);
        // собрать стрим в список
        List<Cat> fatCats = catStream.collect(Collectors.toList());

        // повторная попытка использования терминального(закрытого) потока будет вызывать ошибку Exception
        // Закрытый поток - поток на котором уже был вызван терминальный метод
      //  fatCats = catStream.filter(cat -> cat.getWeight() > 5).collect(Collectors.toList());  // БУДЕТ ОШИБКА

        System.out.println("fatCats: " + fatCats);


    }


    private static List<Cat> getListCts(){
        return List.of(
                new Cat("Bear", 5, "braun"),
                new Cat("Python", 7, "green"),
                new Cat("Tiger", 3, "gray"),
                new Cat("Panda", 4, "black")
        );
    }


    private static void task1() {
        List<Integer> integers = List.of(-1, 12, 0, 5, 1, -15, 24, 0);
        // список содержащий пологительные числаю
        // Список должен быть отсортирован в порядке возрастания

        List<Integer> result = new ArrayList<>();
        for (Integer integer : integers) {
            if (integer > 0) {
                result.add(integer);
            }
        }
        result.sort(Comparator.naturalOrder());
        System.out.println(result);

        // ПРИ ПОМОЩИ ПОТОКОВ , в декларативном стиле.

        // у всех коллекций есть метод stream() создающий поток из эл-тов коллекции
        List<Integer> integerList = integers.stream()// создание потока на основе эл-тов списка
                .filter( i -> i > 0) // фильтрация эл-тов потока, останутся только положетильные
                .sorted() // сортировка оставшихся эл-тов потока  в естественном порядке
                .collect(Collectors.toList()); // собирает эл-ты потока в коллекцию List

        System.out.println("integerList: " + integerList);

        // integers.stream().filter(i -> i > 0).sorted().collect(Collectors.toList());




    }
}
