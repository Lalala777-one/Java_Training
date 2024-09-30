package lesson_07;

public class SwitchExample {
    public static void main(String[] args) {
        // позволяет сравнивать переменную с несколькими значениями и взависим от знач перемен выполнять определ блок кода

        int x = 7;

        switch (x){
            case 5:
                System.out.println("Switch: x = 5" );
                break;
            case 7:
                System.out.println("Switch: x = 7");
                break;
            default:
                System.out.println("else: что-то другое");
        }

    }
}
