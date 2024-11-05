package homeWork_38.task1;

import java.util.Arrays;
import java.util.Comparator;

public class SportsmanMain {
    public static void main(String[] args) {

Sportsman[] sportsmens = new Sportsman[5];
        sportsmens[0] = new Sportsman("Pedro", 19, 6.7);
        sportsmens[1] = new Sportsman("Sebastian", 23, 7.2);
        sportsmens[2] = new Sportsman("Ben", 25, 6.7);
        sportsmens[3] = new Sportsman("Martin", 32, 9.6);
        sportsmens[4] = new Sportsman("Tom", 32, 5.2);


        /*
 Отсортируйте его с использованием:
естественного порядка, определенного в Comparable,
данного класса Comparator,
анонимного класса Comparator для сортировки по третьему полю (например, age).
         */


        Arrays.sort(sportsmens); // естественного порядка, определенного в Comparable,

        for (Sportsman sportsmans : sportsmens){
            System.out.println(Arrays.toString(sportsmens));
        }

        SportsmanScoreComparator sportsmanScoreComparator = new SportsmanScoreComparator();



        Arrays.sort(sportsmens, sportsmanScoreComparator); // данного класса Comparator
        System.out.println(Arrays.toString(sportsmens));


        // анонимного класса Comparator для сортировки по третьему полю (например, age).

        Arrays.sort(sportsmens, new Comparator<Sportsman>() {

            @Override
            public int compare(Sportsman sp1, Sportsman sp2) {

                return Integer.compare(sp1.getAge(), sp2.getAge());
            }

        });

        System.out.println(Arrays.toString(sportsmens));
    }
}
