package homework_24.task1;

public class Triathlete implements Swimmer, Runner {

    private String name;
    private int age;

    public Triathlete(String name, int age) {
        this.name = name;
        this.age = age;
    }

public String toString(){
        return "Name " + name + ", age " + age;
}
    @Override
    public void swim() {
        System.out.println(name + " is swimming.");

    }

    @Override
    public void run() {
        System.out.println(name + " is running.");
    }

}
