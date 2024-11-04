package lesson_38;

// внешние инструменты для сравнения наших машин
// Comparator пишется отдельным классом

import java.util.Comparator;

public class CarSpeedComparator implements Comparator<Car> {


    /*
    car1 < car2 -> отрицательное
     car1 == car2 -> 0
      car1 > car2 -> положительное

     */
    @Override
    public int compare(Car car1, Car car2) {
        return car1.getMaxSpeed() - car2.getMaxSpeed(); // просто отнимаем скорость первой от второй
        // можно умножить на -1 и тогда отсортируется от большей скорости к меньшей
    }
}
