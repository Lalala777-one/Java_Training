package lesson_40;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {


        // Конструкторы ArrayList
        List<Integer> list = new ArrayList<>(); // Создает список с начальной емкостью "под капотом" 10 элементов
        list = new ArrayList<>(50); // создает пустой список с указанной емкостью
        list = new ArrayList<>(List.of(1, -10, 5, 0, 25, -100)); // принимает коллекцию
        //  Создает список содержащий все эл-ты указанной коллекции. Копирование эл-тов другой оллекции


        // Конструкторы LinkedList

        list = new LinkedList<>(); // создает пустой список
        list = new LinkedList<>(List.of(1, -10, 5, 0, 25, -100));// Создает список содержащий все эл-ты указанной коллекции.

        // Методы интерфейса List

        // boolean add(E e) добавляет элемент в конец списка
        list.add(1000);
        list.add(100);

        System.out.println("list " + list);


        // void add(int index, E element) - добавление элемента на указанную позицию
        list.add(2, 100);
        System.out.println("list " + list);

        // E get (int index) - возвращает элемент по указанному индексу
        int value = list.get(5);
        System.out.println("value " + value);

        // E remove (int index) - удаляет элемент по указанному индексу, возвращает старое значение
        System.out.println("list.remove(5) : " + list.remove(5));
        System.out.println("list: " + list);

        // Метод удаления по значению из интерфейса Collection
        list.remove(Integer.valueOf(1000)); // засунуть int в обертку Integer
        System.out.println(list);

        // поиск элементов по значению. Возвращает индекс
        // int indexOf(Object obj)
        // int lastIndexOf(Object obj)

        System.out.println("list.indexOf(100) " + list.indexOf(100));
        System.out.println(list.lastIndexOf(100));

        // void sort(Comparator<? super E> comparator) - сортирует список с исспользованием указанного компаратора

        list.sort((i1, i2) -> i2.compareTo(i1)); // в обратном порядке
        System.out.println("list.sort((i1, i2) -> i2.compareTo(i1) " + list);


        // List<E> subList(int indexFrom, int indexTo) - возвращает список из элементов, находящихся на позициях от indexFrom до  indexTo

        List<Integer> subList = list.subList(1, 5);
        System.out.println("subList " + subList);

    }
}
