package homework22.Task1.Task3;

public class Triangle extends Figure{

    private int base;
    private  int heightByBase;


    public Triangle(String name, int base, int height) {
        super(name);
        this.base = base;
        this.heightByBase = height;
    }

    public  double calculateArea(){
        double square = 0.5 * base * heightByBase;
        System.out.printf("Площадь %s : %.2f%n", name, square);
        return square;
    }

}
