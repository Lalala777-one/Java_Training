package homework22.Task1.task2;

public abstract class Vehicle {


    private String model;
    private int year;
    private String color;
    protected String engine;

    public Vehicle(String color, int year, String model) {
        this.color = color;
        this.year = year;
        this.model = model;
    }


    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void startEngine();

     /*
    Дочерние классы Car, Bicycle и Motorcycle должны переопределить
     метод startEngine() для запуска соответствующего типа двигателя (если есть).
     */


}
