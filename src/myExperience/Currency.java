package myExperience;

public enum Currency {

    USD(1.0),
    EUR(1.08),
    GBP(0.74),
    JPY(148.19);

    private final double exchangeRate;

    Currency(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
    public double convertFromUSD(double sumUSD){
        return sumUSD * exchangeRate;
    }
}

class Test3{
    public static void main(String[] args) {
        System.out.println(Currency.EUR.convertFromUSD(100));
        System.out.println(Currency.JPY.convertFromUSD(100));
    }
}


/*
Задача 4: Валюты и обменные курсы
Создайте перечисление для разных валют (например, USD, EUR, GBP, JPY).
Добавьте поле для хранения курса обмена по отношению к USD. Реализуйте метод
 для конвертации суммы из долларов в выбранную валюту.

Ожидаемый результат:
System.out.println(Currency.EUR.convertFromUSD(100)); /
 */
