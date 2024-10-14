package lesson_23.abstracts_class;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Кот " + name +  " очень любит кушать");
    }

     void move(){
         System.out.println("Кот " + name + " передвигается");
    }
}
