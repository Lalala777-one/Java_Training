package homework22.Task1;

public class ProfessionalAthlete extends AmateurAthlete{

    private static final int speed = 25;


    public ProfessionalAthlete(String name, int age, int speed) {
        super(name, age, speed);
    }

    public void rest(){
        System.out.println(name + " needs 5 minutes of rest.");
    }
}
