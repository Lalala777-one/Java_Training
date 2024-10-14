package lesson_23.abstracts_class;

abstract class Cow extends Animal{

    public Cow(String name) {
        super(name);
    }
    @Override
    void eat() {
        System.out.println("Cow " + name + " eat");
    }

}
