package lesson_16;

public class Dog {

    String name;
    int weight;

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    String info() {
        return "I am dog " + name + ", my weight is " + weight;
    }

    void eat() {
        System.out.println("I am eating!");
        weight++;
    }

    void run() {
        while (weight < 5 ){
            System.out.println("Сорян! Я слишком худая и голодная, не могу бежать! Дай поесть");
            System.out.println("Мой вес сейчас " + weight);

            eat();

        }
            System.out.println("I am running!");
            weight -= 2;

    }
}
