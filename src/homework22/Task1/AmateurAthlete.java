package homework22.Task1;

public class AmateurAthlete extends Human{

    private static final int speed = 15;


    public AmateurAthlete(String name, int age, int speed) {
        super(name, age, speed);
    }

    public void rest(){
        System.out.println(name + " needs 10 minutes of rest.");
    }
}
