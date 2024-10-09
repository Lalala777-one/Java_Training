package homework_20;

public class AnimalTestMain {
    public static void main(String[] args) {

        Tiger tiger = new Tiger("Amfi", "felidae", "red", 8, 40, 49,
                "tropical forests");

        Hare hare = new Hare("Pini", "fields", "white", 5, 3, 30);

        System.out.println(tiger.toString());
        tiger.eat();
        tiger.sleep();
        tiger.meow();

        System.out.println("=================================");
        System.out.println(hare.toString());
        hare.eat();
        hare.sleep();
        hare.hop(5);
    }
}
