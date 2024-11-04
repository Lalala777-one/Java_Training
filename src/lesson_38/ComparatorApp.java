package lesson_38;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {

    public static void main(String[] args) {

        int[] numbers = {8, 9, 4, 0, 3, 1, 7};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] strings = {"Abbb", "Cccc", "apple", "Zebra"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));

        Car[] cars = new Car[5];
        cars[0] = new Car("Alfa", 2021, 120);
        cars[1] = new Car("BMW", 2008, 190);
        cars[2] = new Car("Citroen", 2018, 190);
        cars[3] = new Car("VW", 2021, 250);
        cars[4] = new Car("Ferrari", 2024, 300);

        System.out.println(Arrays.toString(cars));

        System.out.println("================ После сортировки ===================");

        Arrays.sort(cars);
        System.out.println(Arrays.toString(cars));

        System.out.println("\n==============================\n");

        CarSpeedComparator carSpeedComparator = new CarSpeedComparator(); // создали объект класса который инплементировал компаратор
        Arrays.sort(cars, carSpeedComparator);
        System.out.println(Arrays.toString(cars));

        System.out.println("\n==============================\n");

        CarModelComparator carModelComparator = new CarModelComparator();
        Arrays.sort(cars, carModelComparator);
        System.out.println(Arrays.toString(cars));

        // анонимный класс // чтобы не создавать отдально классы
        // реализация comparator видна сразу в коде
        // ухудшает читаемость если в интерфейсе много методов для реализации
        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getModel().compareTo(car2.getModel());
            }
        });

        System.out.println(Arrays.toString(cars));

        // Хотим сравнить машины по году в порядке возврастания
        // ЕСли год совпадает - сравнить такие машины в порядке убывания(обратный естественному)

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                int yearCompare = c1.getYear() - c2.getYear();
                if (yearCompare == 0) {    // годы оказались равны

                    return c2.getModel().compareTo(c1.getModel());

                }
                return yearCompare; // отрицательное или положительное значение
            }
        })
        ;

        System.out.println(Arrays.toString(cars));


        // ФУНКЦИОНАЛЬНЫЙ ИНТРЕРФЕЙС - интерфейс который имеет ровно ОДИН абстрактный метод
        // могут быть есть еще статические и/или дефолтные

        // ЛЯМБДА-выражения - способ краткой записи анонимных функций
        //  Исспользуется иссключительно для реализации функциональных интерфейсов

        //СИНТАКСИС
        // (параметр ) -> {тело выражения(реалищация метода)}
        System.out.println(" С Лямбда ");


        // Когда реализация состоит из одного выражени, фигурные скобки не исспользуются
        // Ключевое слово  return не исспользуется. Результат выражения автоматически возвращается

        Arrays.sort(cars, (car1, car2) -> car1.getMaxSpeed() - car2.getMaxSpeed()); // с исспользованием лямбда выражения  / от меньшей к большей
        System.out.println(Arrays.toString(cars));


        // с лямбда
        // Когда появляется блок -  требуется исспользование return
        Arrays.sort(cars, (c1, c2) -> {
            int yearCompare = c1.getYear() - c2.getYear();
            if (yearCompare == 0) {    // годы оказались равны
                return c2.getModel().compareTo(c1.getModel());
            }
            return yearCompare; // отрицательное или положительное значение
        });


        Arrays.sort(cars, (car1, car2) -> {
            int yearCompare = car1.getYear() - car2.getYear();
            if (yearCompare == 0) {
                return Integer.compare(car1.getMaxSpeed(), car2.getMaxSpeed()); //в порядке возрастания
//           return Integer.compare(car2.getMaxSpeed(), car1.getMaxSpeed()) // в порядке убывания

            }
            return yearCompare;
        });

        System.out.println("_______________________________________________");
        System.out.println(Arrays.toString(cars));

        System.out.println("_______ В обратном порядке _____________________");
        // отсортировать с использованием лямбда в обратном порядке по году
        Arrays.sort(cars, (car1, car2) -> car2.getYear() - car1.getYear());
        System.out.println(Arrays.toString(cars));
    }
}
