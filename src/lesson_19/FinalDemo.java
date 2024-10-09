package lesson_19;

public class FinalDemo {

    public static final double PI = 3.141519; //константа
    public static final int[] ints = new int[10]; // не явл константой так как можно изменить состояние объекта
    public static final String COUNTRY = "Germany"; //костанта так как не возможно изменить значение самой строки

    private final int x;

    private final int[] array = new int[10];

    public FinalDemo(int x){
        this.x = x; // после инициализации переменной final нельзя поменять значение переменной
    }

    public FinalDemo(){
        this.x = 100;
        // нельзя присвоить ссылку на другой объект
        //но мы можем изменить состояние самого объекта
       // this.array = new int[20];

        this.array[0] = 10;
        this.array[array.length - 1] = 15000;

    }


}
