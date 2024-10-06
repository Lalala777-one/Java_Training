package lesson_15;

public class MainCats {
    public static void main(String[] args) {
        Cat cat = new Cat("Murka", "red", 2);


        System.out.println(cat.age);
        cat.sayMeow();
        cat.run();
        cat.sleep();

        String catName = cat.name;
        int carAge = cat.age;
        System.out.println("Name: " + catName);  // по умолчанию будет null для типа данных String
        System.out.println("Age: " + carAge);  // по умолчанию будет 0 для типа данных int

        System.out.println("==============\n");

        Cat cat1 = new Cat("Amfi");
        System.out.println("Name: " + cat1.name);
        System.out.println("Color: " + cat1.color);

        System.out.println("==============\n");

        Cat cat2 = new Cat("Tuti", "black");
        cat2.whoAmI();
    }

}
