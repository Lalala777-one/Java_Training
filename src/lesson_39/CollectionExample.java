package lesson_39;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        // интерфейс Collection который гарантирует наличие базовых методов для всех расширяющих его интерфейсов
        // это позволяет единообразно обрабатывать различные типы коллекций

        // создаем коллекцию строк
        // ссылка типа интерфейс а справа мы можем подставить объект разных классов. Т.е. получить разные реализации этого интерфейса

        Collection<String> strings = new ArrayList<>();

        // int size (возвращает количество эл.тов в коллекции)

        System.out.println("strings.size() : " + strings.size());

        // boolean isEmpty() возврашает true если коллекция пустая
        System.out.println("strings.isEmpty() " + strings.isEmpty());


        // boolean add (T t) добавляет эл.т в коллекцию
        strings.add("Java");
        strings.add("Hello");

        //Переопределенный метод toString для красивого вывода эл-тов коллекции
        System.out.println((strings));

        // Метод .of() - это статический метод в нескольких интрерфейсах и классах был введен в Java 9
        // Создает неизменяемый экземпляр коллекции из предоставленных элементов.
        // Доступен для List, Set, Map

        Collection<Integer> integers = List.of(0, 1, 2, 3, 4, 5);
        System.out.println("integers " + integers);
        // integers.add(6); // Попытка изменить неизменяемую коллекцию приведет к ошибке (Исключительной ситуации)


        // addAll(Collection<? extends T> col - добавляет все элементы из указанной коллекции в текущую (сложение)

        strings.addAll(List.of("World", "Hey", "Car"));
        System.out.println(strings);

        // boolean removeAll(Collection<?> col) - удаляет все элементы из коллекции вызова, содержащиеся в коллекции col (вычетание)

        Collection<Integer> numbers = new ArrayList<>();
        numbers.addAll(List.of(0, 1, 2, 3, 3, 4, 5));
        System.out.println("numbers " + numbers);
        numbers.removeAll(List.of(1, 2, 3));
        System.out.println("new numbers " + numbers);

        // boolean retainAll (Collection<?> col) - оставляет в коллекции вызова только те элементы которые содержатся в коллекции col
        // Удаляет из коллекции вызова элементы которые не содержатся в коллекции col

        Collection<Integer> colA = new ArrayList<>();
        Collection<Integer> colB = new ArrayList<>();

        colA.addAll(List.of(10, 20, 30, 20, 40, 50));
        colB.addAll(List.of(20, 30, 40));
        System.out.println("colA " + colA);
        System.out.println("colB " + colB);

        colA.retainAll(colB);
        System.out.println("colA.retainAll(colB) " + colA);


        // boolean remove(Object obj) - удаляет элемент из коллекции. Возвращает true если такой элемент был

        System.out.println("colA.remove(100) " + colA.remove(100));
        System.out.println("colA.remove(40) " + colA.remove(40));
        System.out.println("colA " + colA);


        // Все конструкторы принимают другую коллекцию
        Collection<String> strings1 = new ArrayList<>(List.of("Test1", "Test2", "Test3"));// Создает коллекцию, содержащую все элементы
        // из указанной коллекции

        System.out.println("strings1 " + strings1); // в эту коллекцию можно будет добавлять/ удалять элементы



    }
}
