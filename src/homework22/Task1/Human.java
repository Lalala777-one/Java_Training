package homework22.Task1;

public class Human {

    protected String name;
    protected int age;
  protected int speed;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSpeed() {
        return speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human(String name, int age, int speed) {
        this.name = name;
        this.age = age;
        this.speed = speed;

    }

    public void run(){
        System.out.println(name + " is running " + speed + " km/h" );

        rest();
    }

    public void rest(){
        System.out.println(name + " needs 15 minutes of rest.");
    }
}
