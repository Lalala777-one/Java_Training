package lesson_24.interfaces.flyable;

public class Duck implements Flyable{
    @Override
    public void fly() {
        System.out.println("Duck is flying.");
    }
}
