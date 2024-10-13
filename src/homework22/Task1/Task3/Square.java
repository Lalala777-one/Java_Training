package homework22.Task1.Task3;

public class Square extends Figure{

    private int sideLength;

    public Square(String name, int sideLength) {
        super(name);
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    public  double calculateArea(){
        double square = sideLength * sideLength ;
        System.out.printf("Площадь %s : %.2f%n", name, square);
        return square;
    }


}
