package homework_23.task2.task1;

public class ShapesApp {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 10);
        // стороны по умолчанию 3, 4, 5
        System.out.println(triangle);

        Shape[] shapes = new Shape[3];
        shapes[0] = new Triangle(5, 7, 9);
        shapes[1] = new Recktangle(10, 20);

        double sumArea = 0;
        double sumPerimeter = 0;

        for (int i = 0; i < shapes.length; i++) {
            Shape shape = shapes[i];
            System.out.print(shape.getClass().getSimpleName() + " площадь " + shape.area());
            System.out.println("; перимеир: " + shape.perimeter());

            sumArea += shape.area();
            sumPerimeter += shape.perimeter();
            System.out.println("================================");
        }

        System.out.printf("Сумма площадей фигур: %.2f\n", sumArea);
        System.out.printf("Сумма периметров фигур: %.2f\n", sumPerimeter);

    }
}
