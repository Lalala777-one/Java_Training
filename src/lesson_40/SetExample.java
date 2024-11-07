package lesson_40;

import java.util.*;

public class SetExample {

    // hash set в произвольном порядке
    // linkedSet сохраняет порядок элементов
    // treeSet сохраняет элементы в отсортированном виде. Есть несколько уникальн методов

    public static void main(String[] args) {

        // Конструкторы
        Set<Integer> set = new HashSet<>(); // Создает пустой хеш-сет емкостью 16 и коэффициент загрузки 0,75
        set = new HashSet<>(20); // Создает пустой хеш-сет с указанной емкостью и коэффициент загрузки 0,75
        // Создает новый сет, содержащий уникальные элементы из указанной коллекции
        set = new HashSet<>(List.of(1, 2, 3, 5, 6, 6, 6, 6, 6, 5, 3));

        System.out.println(set);

        List<Integer> startValues = new ArrayList<>(List.of(15, 1, 2, 3, 4, 3, 8, 6, 15, 7, 0, 16, 32));
        System.out.println(startValues);

        // HashSet не поддерживает порядко добавления элементов
        Set<Integer> integers = new HashSet<>(startValues);
        System.out.println("integers hashSet: " + integers);

        // LinkedHashSet сохраняет порядок добавления элементов
        Set<Integer> linkedSet = new LinkedHashSet<>(startValues);
        System.out.println("linkedSet: " + linkedSet);

// Метода интерфейса Set

        // boolean add(E e) - добавление элемента
        System.out.println("integers.add(100): " + integers.add(100)); // true - элемент добавлен, т.к. еще не было такого значения
        // false - элемент НЕ добавлен, т.к. такое значения уже есть в сете (дубликат)
        System.out.println("integers.add(100) #2 : " + integers.add(100)); // false
        System.out.println("integers: " + integers);

        // boolean remove(Object obj) - удаляет элемент по значению
        System.out.println("integers.remove(100): " + integers.remove(100)); // true
        System.out.println(integers);
        System.out.println("integers.remove(100) #2: " + integers.remove(100)); // false

        System.out.println("\n ================== \n");
        // boolean contains(Object obj) - проверяет присутствие значения в множестве
        System.out.println("integers.contains(100): " + integers.contains(100));
        System.out.println("integers.contains(32): " + integers.contains(32));

        /*
        int size() - кол-во элементов
        boolean isEmpty() - true, если множество пустой
        clear() - удаляет все элементы
         */

        // iterator() - возвращает итератор для элементов set-a
        // Наличие итератора, позволяет перебрать все элементы циклом for-each
        for (Integer value: integers) {
            System.out.print(value + ", ");
        }
        System.out.println();

        // Написать метод, который принимает список (List) и возвращает список (List), состоящий только из уникальных элементов начального списка
        // Убрать дубликаты
        System.out.println("startValues: " +  startValues);
        List<Integer> resultList = getUniqueList(startValues);
        System.out.println("resultList: " + resultList);

        System.out.println("\n =================== \n");



        // SortedSet. Конструктор
        // Конструктор по умолчанию, естественный порядок сортировки, если реализован Comparable

        SortedSet<Integer> sortedSet = new TreeSet<>(); // создает постое, упорядоченное множество (сортировка в естественном порядке)
        sortedSet.addAll(startValues);
        System.out.println("sortedSet " + sortedSet);


        // Конструктор принимающий коллекцию, естественный порядок

        sortedSet = new TreeSet<>(startValues); // будут добавленны все жлементы из коллекции
        System.out.println("startValues " + startValues);

        // Конструктор с компаратором определяющим порядок хранения элементов

        SortedSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder()); // обратный естественному порядок сортировки
        treeSet.addAll(startValues);
        System.out.println("treeSet " + treeSet);

        treeSet = new TreeSet<>((i1, i2) -> i2 - i1); // на лямбда, также в обратном порядке
        treeSet = new TreeSet<>((i1, i2) -> i2.compareTo(i1));
        treeSet.add(10);
        System.out.println("treeSet " + treeSet);


        // УНИКАЛЬНЫЕ МЕТОДЫ TreeSet

        //first() возвращает самый первый (наименьший  по мнению Comparator -a элемент)

        System.out.println("treeSet.first() " + treeSet.first());

        // last() возвращает самый последний (наибольший элемент по мнению Comparator -a)
        System.out.println("treeSet.last() " + treeSet.last());

        SortedSet<Integer> integerSortedSet = new TreeSet<>(startValues);
        System.out.println("integerSortedSet " + integerSortedSet);

        // headSet (E element) возвращает часть множества, элементы которого строго меньше чем element

        System.out.println("integerSortedSet.headSet(8) " + integerSortedSet.headSet(8));
        // изначальный set остается неизменным
        System.out.println("integerSortedSet " + integerSortedSet);

        // tailSet возвращает новое множество состоящее из элементов стаого,
        //  которые больше или равны element

        SortedSet<Integer> tailSet = integerSortedSet.tailSet(8); // 8 включается
        System.out.println("tailSet " + tailSet);


        // subSet (E fromElement, E toElement) - возвращает новое множество, которое находится в диапазоне
        // от fromElement включительно до toElement НЕ включительно

        System.out.println(integerSortedSet.subSet(3, 16));


        // comparator() - Возвращает компаратор, используемый для упорядовачивания элементов в этом множестве
        // вернется null если используется так называемый ЕСТЕСТВЕННЫЙ ПОРЯДОК

        System.out.println(integerSortedSet.comparator()); // вернется null












    } // Main

    public static List<Integer> getUniqueList(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (Integer value : list) {
            if (!result.add(value)) {
                result.add(value);
            }
        }
        return result;
    }

    public static <T> List<T> getUniqueList2(List<T> list) {
        // получить set состоящих из уникальных элементов списка
        Set<T> set = new LinkedHashSet<>(list);
        // вернуть новый спискок, содержащий все элементы set-a
        return new ArrayList<>(set); // возвращаем список

    }

}
