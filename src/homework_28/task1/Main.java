package homework_28.task1;

public class Main {

        public static void main(String[] args) {
            Rectangle rectangle = new Rectangle();
            System.out.println(rectangle.toString());

            Rectangle rectangle1 = new Rectangle(2.0, 3.0);
            System.out.println(rectangle1.toString());

            Rectangle rectangle2 = new Rectangle(2.0, 3.0);

            System.out.println("rectangle.equals(rectangle1) " + (rectangle.equals(rectangle1)));
            System.out.println("rectangle1.equals(rectangle2) " + (rectangle1.equals(rectangle2)));
        }
}
