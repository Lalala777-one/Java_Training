package lesson_18;

public class CarApp {


    public static void main(String[] args) {

        System.out.println("totalCarProduced: " + Car.totalCarProduced);

        Car car = new Car("BMW", 200);
        System.out.println(car.toString());

        Car car1 = new Car("Audi", 208);
        System.out.println(car1.toString());

        Car car2 = new Car("Tesla", 506);
        System.out.println(car2.toString());

        System.out.println("totalCarProduced: " + Car.totalCarProduced);

        // к статической переменной лучше образаться от имени класса, чтобы не было путаницы


        // исспользование статических методов "утилитных"

        int sum = MathUtils.sumOfInts(4, 5);
        System.out.println("sum = " + sum);

    }
}
