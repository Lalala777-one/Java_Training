package lesson_16;

import lesson_15.Cat;

public class Lesson16 {
    public static void main(String[] args) {

        Cat catVar = new Cat();
        /*
        1.Создается новый объект типа Cat "Cat - ссылочный тип данных"
        2. Вызывается конструктор для инициализации полей
         */
        System.out.println(catVar.name);
        catVar.name = "Amfi";
        System.out.println(catVar.name);


        catVar.age = 2;
        catVar.color = "black";

        Cat barsik = new Cat("Barsik", "grey", 2);
        System.out.println(barsik.name);
        barsik.whoAmI();

        Cat cat1 = new Cat("Barsik", "grey", 2);
        cat1.whoAmI();

        System.out.println("=======================");


        Cat catClone = cat1;  //теперь две переменные ссылаются на один объект
        catClone.whoAmI();

        cat1.age = 100;
        cat1.whoAmI();

        catClone.whoAmI();

        // catClone = null;  // будет NullPointerExeption , у null нельзя вызывать методы, присвоить значения и тд,
        // нет привязки к объекту
        // catClone.whoAmI();

    }
}
