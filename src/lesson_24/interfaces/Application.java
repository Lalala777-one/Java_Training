package lesson_24.interfaces;

public class Application {
    public static void main(String[] args) {
        Book book = new Book("Мастер и Маргарита", "М.Булгаков");
        book.print();

        Printable book1 = new Book("Философия Java", "Б.Эккель");

        Journal journal = new Journal("Cosmopolitan", 154);
        Printable journal1 = new Journal("Deutsch perfect", 12);

        System.out.println("=============================");

        Presentation presentation = new Presentation(
                "Inheritance",
                "Noname",
                "Inheritance in OOP",
                20);

        presentation.print();
        presentation.colorPrint();
        presentation.test();

        Printable printable = presentation;
        printable.print();




    }
}
