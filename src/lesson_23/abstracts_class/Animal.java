package lesson_23.abstracts_class;

// если в классе есть хотя бы один абстрактный метод (без реализации)
// класс обязан быть помечен как абстрактный
abstract class  Animal {

    // Абстрактный метод не имеет реализации

    protected String name;

    public Animal(String name) {
        this.name = name;
    }
    // абстрактный метод не имеет реализации (тела метода)

    abstract void eat();

    abstract void move();

    public void sayHello(){
        System.out.println("Hello from Animal");
    }
}


