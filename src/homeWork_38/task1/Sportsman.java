package homeWork_38.task1;

public class Sportsman implements Comparable <Sportsman>{

    private String name;
    private int age;
    private double score;

    public Sportsman(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Sportsman{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", score = " + score +
                '}';
    }

    @Override
    public int compareTo(Sportsman number1) {
        return this.name.compareTo(number1.name);
    }
}

