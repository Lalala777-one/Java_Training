package homework22.Task1.task2;

public class Car extends Vehicle{

    public Car(String color, int year, String model, String engine) {
        super(color, year, model);
        this.engine = engine;
    }

    public void startEngine(){
        System.out.println(engine + " engine is ON.");
    }


}
