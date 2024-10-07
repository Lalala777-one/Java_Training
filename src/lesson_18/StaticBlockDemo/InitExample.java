package lesson_18.StaticBlockDemo;

public class InitExample {

    static String[] colors;
    static int counter = 1;

    private String title = "Hello";
    private int capacity = 10;

    // статический блок инициализации
    //  вызывается только один раз в момент загрузки класса в JVM
    //  инициализации статических полей
    // это способ проинициализировать поля

    static {
        System.out.println("Static init block run!");
        colors = new String[3];
        colors[0] = "red";
        colors[1] = "blue";
        colors[2] = "white";

    }

    // может быть нестатический блок инициализации, исп редко.
    // выполняется ДО конструктора. Выполняется один раз

    {
        System.out.println("Non-Static init bloc run!");
        this.title = "Non-Static title";
    }



    public InitExample() {
        System.out.println("Construktor run!");
        this.title = "Constructor";
    }

    public String toString() {
        return "title: " + title + ", campacity: " + capacity
                + ", static counter; " + counter;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCopacity() {
        return capacity;
    }

    public void setCopacity(int copacity) {
        this.capacity = copacity;
    }
}
