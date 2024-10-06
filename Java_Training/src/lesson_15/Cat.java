package lesson_15;

public class Cat {

    public String name;
    public String color;
    public int age;

    // КОНСТРУКТОР КЛАССА
    // специальный тип метода, основная задача - установить начальные значения свойств объекта
/*
1. Имя конструктора совпадает с именем класса
2. Конструктор не имеет возвращаемого типа
3. Конструктор вызывается автоматически при создании объекта.
 */

    public Cat() {

    }

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    ;


    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }


    public void sleep() {
        System.out.println("I am sleeping");
    }

    public void run() {
        System.out.println("I am running");
    }

    public void sayMeow() {
        System.out.println("Meow");
    }

    public void whoAmI() {
        System.out.printf("Я котик %s, мой возраст: %d, мой окрас: %s\n", name, age, color);
    }
}
