package lesson_38;

public class Car implements Comparable<Car>{

    private String model;
    private int year;
    private int maxSpeed;

    public Car(String model, int year, int maxSpeed) {
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model = '" + model + '\'' +
                ", year = " + year +
                ", maxSpeed = " + maxSpeed +
                '}';
    }

    /*
        a vs b -> из а вычитает b
        a < b -> отрицательное значениие
        a > b -> метод вернет положительное значение
        a == b -> метод вернет 0
         */
    // сравнение по году выпуска. "Меньшей" будет считаться машина с меньшим годом выпуска
    @Override
    public int compareTo(Car car1) {

        return this.year - car1.year; // берем год выпуска машины и вычитаем год выпуска машины
        //которая  пришла на сравнение


    }
}
