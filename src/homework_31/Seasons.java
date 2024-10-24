package homework_31;

import java.util.Arrays;

public enum Seasons {

    /*
    Реализуйте Enum для определения четырех времен
    года с методами, возвращающими среднюю температуру для каждого времени года.
     */

    WINTER(new double[] {- 8.1, - 10.3, - 13.5}),
    SPRING(new double[]{13.1, 16.4, 18}),
    SUMMER(new double[]{25.6, 34, 37.1}),
    AUTUMN(new double[]{17.5, 14, 8.6});


    private final double[] monthlyTemperatures;

    // конструктор
    Seasons(double[] monthlyTemperatures) {
        this.monthlyTemperatures = monthlyTemperatures;
    }

    public double[] getMonthlyTemperatures() {
        return monthlyTemperatures;
    }

    //метод вычисл средн.арифм
    public double averageSeasonsTemperature(){
      double sum = 0;
        for (double temp : monthlyTemperatures) {
            sum += temp;
        }
        return sum / monthlyTemperatures.length;
    }




}
