package homework_31;

public class Main {
    public static void main(String[] args) {
        for (Seasons season : Seasons.values()) {
            System.out.printf("%s: Средняя температура = %.2f°C%n",
                    season, season.averageSeasonsTemperature());
        }
    }
}
