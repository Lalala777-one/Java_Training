package homework_19;

public class ImmutablePoint {

    /*
    !Объявите final поля x и y типа int.
•	!Инициализируйте их через конструктор.
•	Попытайтесь создать методы-сеттеры для изменения значений x и y.
•	Объясните, почему значения полей не могут быть изменены после создания объекта.
     */

    private final int x;
    private final int y;

    public ImmutablePoint(int x, int y){
        this.x = x;
        this.y = y;
    }




/*
для final переменных не создаются сеттеры, так как они не могут изменяться
будет ошибка компиляции

    public void setX(int x){
        this.x = x;
 */


    }

