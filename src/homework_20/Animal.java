package homework_20;

public class Animal {

    /*
    Придумать и написать как минимум одну иерархию классов в которой будет один родительский клас
    и два наследника, расширяющих его функционал

У родительского класса должен быть метод создающий строку с информацией об объекте (метод String toString())
     */
    private String name;
    private String species;
    private int age;
    private int weight;
    private String color;

    public Animal(String name, String species, String color, int age, int weight) {
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getSpecies(){
        return species;
    }

    public String getColor(){
        return color;
    }

    public int getAge(){
        return age;
    }

    public int getWeight(){
        return weight;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setWeight(int weight){
            this.age = age;
        }


    public String toString() {
        return String.format("%s species: %s, %s.\nAge: %d\nWeight: %d\n", name, species, color, age, weight);

    }

    public void eat() {
        System.out.println("Animal is eating.");
    }

    public void sleep() {
        System.out.println("Animal is sleeping.");
    }

    public void move() {
        System.out.println("Animal is moving.");
    }
}
