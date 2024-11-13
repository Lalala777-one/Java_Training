package lesson_44;

import lesson_43.Cat;

import java.util.*;
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

       1_  sorted() - сортирует поток в естественном порядке
       2_  sorted(Comparator <T> comparator) - будет сортировать поток с исспользованием компаратора

       3_  Stream<R> map(Function<T, R> action) - преобразует элементы потока с использованием заданной функции

       4_  distinct() метод удаляет дубликаты

       5. void peek (Consumer<T> action) - выполняет действия для каждого элемента потока

       6. limit (long maxSize) - ограничивает колич элементов потока заданным значение. В потоке может быть не больше
       maxSize элементов

       7. skip(long n) - пропускает первые n элементов потока

       8. mapToObj (IntFunction() mapper - преобразование примитивного типа данных в ссылочный тип данных при помощи заданной функции

       9. mapToInt - преобразует поток в IntStream - поток примитивов

       10. boxed() - используется для преобразования потока примитивов в поток их соответствующих оберток
                */

        /*
        ТЕРМИНАЛЬНЫЕ МЕТОДЫ:

        R collect(Collector<T, A, R> collector) - преобразует эл-ты потока в разные типы коллекций или другие структуры данных

        void foreach(Consumer<T? action) - выполняет заданное действие для каждого элем потока

        Optional <T> min (Comparator<T> comparator) Элемент с мин значением в соответствии с компаратором

       Optional <T> max (Comparator<T> comparator) Элемент с  max значением в соответствии с компаратором

         */

        //task1();
        //task2();
        //task3();
        // task4();
        // task5();
        //task6();
        // tast7();
        //task8(); // сделать поток из массива
        // todo пересмотреть task9
        //task9(); // создание потока из map
       // task10(); // Optional
       // tast11(); // важный метод с Optional

       // task12(); //  // получить список из трех самых маленьких чисел из списка
        task13(); // // преобразовать массив примитивов в коллекцию при помощи Stream





    }// main

    private static void task13() {
        // преобразовать массив примитивов в коллекцию при помощи Stream
        int[] ints = new int[]{1, 2, 3, 4, 5, 6};

        List<Integer> integers = Arrays.stream(ints) // получаем поток примитивов
                .boxed()
                //.mapToObj(i -> Integer.valueOf(i)) // mapToObj (i -> i) АВТОУПАКОВКА, АНАЛОГ (i -> Integer.valueOf(i))  // преобразовываем каждый элемент
                // примитива в Integer что позволяет собрать в коллекцию
                .collect(Collectors.toList());
        System.out.println(integers);

        int[] intArray = integers.stream()
                .mapToInt(i -> i)// автораспаковка
                .toArray();

        System.out.println(Arrays.toString(intArray));

    }

    private static void task12() {
        // получить список из трех самых маленьких чисел из списка
        List<Integer> integers = List.of(0, 5, 1, 4, 7, 55, 78);
        // integers = List.of(10, 5);  не вызовет ошибки, просто выдаст два числа
        List<Integer> smallest = integers.stream()
                .sorted()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("smallest: " + smallest);

        // Получить список чисел, отбросив два самых маленьких
        List<Integer> list = integers.stream()
                .sorted() // отсортировали но возрастанию
                .skip(2) // пропустили первые два элемента из уже отсортированных
                .collect(Collectors.toList()); // закрыли поток
        System.out.println("list: " + list);

        // собирание массива из списка
        Integer[] arrayIntegers = integers.stream()
                .toArray(Integer[]:: new); // toArray(String[]:: new); если нужен массив String

    }

    private static void tast11() {
        List<Cat> cats = gerListCats();
        // Верните самое длинное имя кота из списка котов
        /*
        Стрим Cat -> Стрим имен
        Найти самое длинное имя (сравнить имена по их длине) -> (max + Comparator сортирующий по длине в порядке возрастания
         */

       Optional<String> longestName = cats.stream()
               .filter(Objects:: nonNull) // проверка null объектов типа cat
                .map(Cat::getName)
               .filter(Objects::nonNull) // проверка имен null
               .max(Comparator.comparing(String::length));
        //.max((n1, n2) -> Integer.compare(n1.length(), n2.length())
              // .max((name1, name2) -> name1.length() - name2.length()); то же самое что и в предыдущей строчке
       if(longestName.isPresent()){
           System.out.println(longestName.get());
       }else {
           System.out.println("Котов с именами не найден");
       }




    }

    private static void task10() {
        // min, max, Optional
        // Optional<T> - класс обертка, который может содержать или объект типа T или null
        // Optional<User>

        List<Integer> integers = List.of(5, 4, 14, 59, 32, 24, -1, -5);

        // Я хочу найти max отрицательное число
        Optional<Integer> max = integers.stream()
                .filter(i -> i < 0)
                .peek(System.out::println)
                .max(Comparator.naturalOrder());

        System.out.println("max.isPresent(): " + max.isPresent()); // вернет true, если значене присутствует  (там не null )
        System.out.println("max.isEmpty(): " + max.isEmpty()); // вернет true, если значение отстутствует (там внутри null)

        if(max.isPresent()){
            Integer value = max.get(); // возвращает значение, если оно присутствует. Если внутри null - будет ошибка
            System.out.println("value: " + value);
        }else {
            System.out.println("Завернут null");
        }

        // Возвращает значение если оно присутствует. Если внутри null - вернет defaultValue (-100);
        Integer optValue = max.orElse(-100);
        System.out.println("optValue: "  + optValue);


        // Создание объектов
        Optional.empty(); // возвращает пустой Optional (завернут null)
        Optional.of(new Object()); // возвращает Optional с не-null значением. Если попытаемся завернуть null = будет NPE nullPointerException
        Optional.ofNullable(null); // возвращает Optional. Можно завернуть или значение или null (вернет пустой Optional)


    } //

    private static Optional<Cat> findCat(String name){
        List<Cat> cats = gerListCats();
        for (Cat cat: cats){
            if(cat.getName().equals(name)) {
                return Optional.of(cat); // если ищем первую совпадающую по имени
            }
        }return Optional.empty();

    }

// последнуюю кошку с таким именем
    private static Optional<Cat> findCat2 (String name){
        List<Cat> cats = gerListCats();

        Cat result = null;

        for (Cat cat: cats){
            if(cat.getName().equals(name)) {
                result = cat;  // последнуюю кошку с таким именем
            }
        }return Optional.ofNullable(result);

    }

    private static void task9() {

        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 5);
        map.put("Cherry", 0);

        map.entrySet().stream() // сделали поток из map
                .filter(entry -> entry.getValue() > 0)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }

    // работа с null
    private static void task8() {
        // Мультикурсор  Alt + Shift + click
        Cat cat = new Cat("Bear", 5, "braun");
        Cat cat1 = new Cat("Python", 7, "green");
        Cat cat2 = new Cat("Tiger", 3, "gray");
        Cat cat3 = new Cat("Panda", 4, "black");

        Cat[] cats = new Cat[]{cat, cat1, null, cat2, cat3};

        // ЗАДАЧА : Получить список кошек, вес которых больше 4

        // ПОЛУЧИТЬ ПОТОК ИЗ ЭЛЕМЕНТОВ МАССИВА
        List<Cat> bigCats = Arrays.stream(cats)
                //.filter(c -> c != null) // так пишется редко
                //.filter(c -> Objects.nonNull(c))// оставить только не null
                .filter(Objects::nonNull)
                .filter(c -> Objects.nonNull(c.getName())) // проверка какого-то поля на null
                .filter(c -> c.getWeight() > 4)
                .collect(Collectors.toList());

        System.out.println(bigCats);
    }


    private static void tast7() {
        // изменить имя котиков, вес которых меньше 5
        // расспечатать и вывести в консоль все эл-ты потока

        List<Cat> cats = gerListCats();

        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() < 5) // фильтруем
                .peek(cat -> cat.setName("Slim_ " + cat.getName())); // промедуточный метод, выолняет действ для каждого элемента

        catStream.forEach(cat -> System.out.println(cat)); //терминальный метод, выполняет действие для каждого элемента в потоке

    }

    private static void task6() {
        // получить список имен кошек, у которых имена короче 5 символов
        List<Cat> cats = gerListCats();
        List<String> catNames = cats.stream()
                .filter(cat -> cat.getName().length() < 5)
                .map(cat -> cat.getName())
                .collect(Collectors.toList());
        System.out.println(catNames);

        System.out.println("\n=====================================================\n");

        // todo этот подход менее производительный,
        //  потому что, даже те кошки которые не проходят по фильтру, будут извлекаться имена в строке map(Cat::getName)
        //  СНАЧАЛА ПРИМЕНЯЕМ ФИЛЬТРАЦИИ
        List<String> catNames2 = cats.stream()
                .map(Cat::getName) // todo разобрать эту строку  Аналог map(cat -> cat.getName())
                .filter(name -> name.length() < 5)
                .collect(Collectors.toList());
        System.out.println(catNames2);

    }

    private static void task5() {
        // получить список имен кошек чей вес больше 4 кг      // создать поток      // оставить кошек чей вес больше
        // изменить тип потока Cat -> name(String)

        List<Cat> cats = gerListCats();

        List<String> catNames = cats.stream()
                .filter(cat -> cat.getWeight() > 4)
                .map(Cat::getName)
                .collect(Collectors.toList());

        System.out.println(catNames);
    }


    private static void task4() {
        List<Cat> cats = gerListCats();
        // Получить список имен всех кошек
        // получаем поток элементов другого типа
        Stream<String> namesStream = cats.stream()
                .map(cat -> cat.getName());

        List<String> catNames = cats.stream()
                .map(Cat::getName)
                .collect(Collectors.toList());

        System.out.println(catNames);

    }

    private static void task3() {

        List<Cat> cats = gerListCats();

        // фильтрация кошек. Оставить котов с именем длиннее 4 символов

        Stream<Cat> stream = cats.stream()
                .filter(cat -> cat.getName().length() > 4);

        // Пока не запущен терминальный метод - промежуточные методы не выполняются
        List<Cat> longNameCats = stream.collect(Collectors.toList());

    }

    private static void task2() {
        List<Cat> cats = gerListCats();

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


    private static List<Cat> gerListCats() {
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
                .filter(i -> i > 0) // фильтрация эл-тов потока, останутся только положетильные
                .sorted() // сортировка оставшихся эл-тов потока  в естественном порядке
                .collect(Collectors.toList()); // собирает эл-ты потока в коллекцию List

        System.out.println("integerList: " + integerList);

        // integers.stream().filter(i -> i > 0).sorted().collect(Collectors.toList());


    }
}
