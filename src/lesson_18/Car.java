package lesson_18;

public class Car {

    public static int totalCarProduced;

    private String model;
    private int powerPS;

    public Car(String model,int powerPS ){
        this.model = model;
        this.powerPS = powerPS;
        totalCarProduced ++; //увеличиваем общее количество произведенных автомобилей при создании нового объекта
    }

    public String toString(){
        return String.format("Auto - model: %s, power: %d. Total produced: %d ", model, powerPS, totalCarProduced);
    }
}
