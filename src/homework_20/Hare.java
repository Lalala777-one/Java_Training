package homework_20;

public class Hare extends Animal {

    private int maxSpeed;

    public Hare(String name, String species, String color, int age, int weight, int maxSpeed) {
        super(name, species, color, age, weight);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void eat() {
        System.out.println("Hare is eating.");
    }

    public void sleep() {
        System.out.println("Hare is sleeping.");
    }

    public void move() {
        System.out.println("Hare is moving.");
    }

    public void runAway() {
        System.out.println("A hare is running away from a predator");
    }

    public void hop(double distance) {
        System.out.printf("The %s rabbit hops %.2f meters!\n", this.getColor(), distance);
    }
}
