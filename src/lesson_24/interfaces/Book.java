package lesson_24.interfaces;

public class Book implements Printable {
    String author;
    String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public void print() {
        System.out.printf("Book %s (%s)\n", title, author);
    }
}

