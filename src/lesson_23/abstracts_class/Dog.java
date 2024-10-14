package lesson_23.abstracts_class;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    void eat(){
        System.out.println("Dog eat");
    }

    public void sayHello() {
        System.out.println("Dog " + name +  " says hello");
    }

    void move(){
        System.out.println("Dog " + name + " передвигается");
    }
}
