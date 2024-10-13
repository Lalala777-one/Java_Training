package homework22.Task1.Task3;

public class FigureMain {

    public static void main(String[] args) {
        Figure[] figures = new Figure[3];

        figures[0] = new Circle("Circle", 23);
        figures[1] = new Square("Square", 5);
        figures[2] = new Triangle("Triangle", 6, 8);

        for (int i = 0; i < figures.length; i++) {
            figures[i].calculateArea();

        }
    }
}
