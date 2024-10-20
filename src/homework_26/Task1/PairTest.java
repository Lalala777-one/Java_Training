package homework_26.Task1;

public class PairTest {

    public static void main(String[] args) {
         Pair<String> pair = new Pair<>("Hello", "World");

        System.out.println(pair);

        System.out.println( pair.getFirst());
        pair.swap();
        System.out.println(pair.toString());
    }
}


