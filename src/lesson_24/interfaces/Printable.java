package lesson_24.interfaces;

public interface Printable {

    public abstract void print();
    default void test(){
        System.out.println("This is a default method");
    }
}

