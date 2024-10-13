package homework22.Task1.Task3;

public abstract class Figure {

    public String name;

    public Figure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double calculateArea();
}
