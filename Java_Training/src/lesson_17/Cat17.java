package lesson_17;

public class Cat17 {
    private String name;
    private int age;
    private int weight;

    public Cat17(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat17(){
    }


    // ГЕТТЕРЫ И СЕТТЕРЫ

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getWeight(){
        return weight;
    }

    //   дает возможность пользователю паменять значения переменных
    //   но здесь я уже могу установить условия, и если пользователь
    //    присылает что-то - не менять данные на те, которые ввел пользователь

    public void setAge(int age){
        if(age < 0 || age > 20){
            return;
        };
        this.age = age;

    }





    void sayMeow(){
        System.out.println("Meow! " + name) ;
    }

    public String toString(){
        return "Cat: " + name + ", age: " + age + ", weight: " + weight;
    }
}
