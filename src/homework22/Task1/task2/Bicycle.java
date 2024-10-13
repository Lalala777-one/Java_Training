package homework22.Task1.task2;

public class Bicycle extends Vehicle{

    public Bicycle(String color, int year, String model) {
        super(color, year, model);

    }

    @Override
    public void startEngine() {
        System.out.println("The bicycle is ready for a ride.");


    }
}
