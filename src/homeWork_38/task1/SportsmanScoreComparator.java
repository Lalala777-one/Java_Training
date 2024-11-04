package homeWork_38.task1;

import java.util.Comparator;

public class SportsmanScoreComparator implements Comparator<Sportsman> {
    @Override
    public int compare(Sportsman sp1, Sportsman sp2) {
        return Double.compare(sp1.getScore(), sp2.getScore());
    }
}
