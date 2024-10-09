package homework_20;

public class Tiger extends Animal{

    private int speed;
    private String habitat;

    public Tiger(String name, String species, String color, int age, int weight, int speed, String habitat) {
        super(name, species, color, age, weight);
        this.speed = speed;
        this.habitat = habitat;
    }

    public int getSpeed(){
        return speed;
    }

    public String getHabitat(){
        return habitat;
    }

    public void eat(){
        System.out.println("Tiger is eating.");
    }

    public void sleep(){
        System.out.println("Tiger is sleeping.");
    }

    public void move(){
        System.out.println("Tiger is moving.");
    }

    public void hunt(){
        System.out.println("Tiger is hunting.");
    }

    public void meow(){
        System.out.println("Tiger is meowing.");
    }
}
