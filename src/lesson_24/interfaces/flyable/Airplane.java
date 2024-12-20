package lesson_24.interfaces.flyable;

public class Airplane extends Transport implements Flyable{


    public Airplane(int capacity) {
        super(capacity);
    }


    boolean takePassenger() {
        if(amount < capacity){
            amount++;
            return true;
        }
        return false;
    }

    @Override
    public void fly() {
        System.out.println("Airplane is flying");
    }
}
