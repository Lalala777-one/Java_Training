package lesson_23.abstracts_class;

public class AnimalsApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Tutu");
        cat.eat();

        Animal cat1 = new Cat("Amfi");
        cat1.eat();

        Animal dog = new Dog("Rex");
        dog.eat();
        dog.sayHello();

        // Нельзя создать экземпляр Абстрактного класса
      //  Animal animal = new Animal();
    }
}
