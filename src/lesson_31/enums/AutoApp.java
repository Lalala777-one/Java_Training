package lesson_31.enums;

public class AutoApp {
    public static void main(String[] args) {

        Color color = Color.GREEN;
        System.out.println(color);

        Auto auto = new Auto("Model1", Color.RED);
        System.out.println(auto);

        auto.setColor(color);
        System.out.println(auto); // присвоили эту переменную типа Color  ( Color color = Color.GREEN;)


        //методы enums
        Color[] colors = Color.values(); // Возвращает массив всех значений
        for (Color currentColor : colors ){
            System.out.println(currentColor);
        }

        // возвращает enum по строковому имени

        Color color1 = Color.valueOf("RED");
        System.out.println(color1);

        // получить имя костранты / преобразование из enum в строку

        String name = Color.RED.name();
        System.out.println(name + " !");

        // Получить порядковый номер начиная с 0

        int ordinal = Color.GREEN.ordinal();
        System.out.println("ordinal GREEN: " + ordinal);


        // enum безопасно сравнивать на равенство оператором ==
        if(auto.getColor() == Color.GREEN){
            System.out.println("Цвет авто зеленый");
        } else
            System.out.println("не зеленый");


        System.out.println("\n =================== switch ====================\n");
        // Очень часто используется в switch

        switch (color){
            case RED:
                System.out.println("Красный");
                break;
            case GREEN:
                System.out.println("Green");
                break;
            case BLUE:
                System.out.println("Blue");
                break;
            default:
                System.out.println("Какой-то другой");
        }
    }
}
