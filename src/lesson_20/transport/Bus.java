package lesson_20.transport;

public class Bus extends Vehicle{

    private int capacity;
    private int countPassengers;

    public Bus(String model, int year, int capacity) {
        // нужно создать объект родителя
        super(model, year); // вызываем конструктор родительского класса
        this.capacity = capacity;  // добавляем то что пришло в параметры конструктора
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    // метод чтобы пассажиры могли войти в автобус


    public boolean takePassenger(){
        // Проверить есть ли свободное место

        if(countPassengers < capacity){
        countPassengers++;
            System.out.println("Пассажир зашел в автобус " + this.getModel());
            return true;
        }
        System.out.printf("В автобусе %s больще нет мест. Сейчас %d пассажиров\n",
        this.getModel(), countPassengers);
        return false;
    }

    // метод высадки пассажира с автобуса

    public boolean dropPassenger(){
        // проверить есть ли в автобусе пассажиры
        if(countPassengers > 0){
            countPassengers --;
            System.out.println("Пассажир вышел с автобуса " + this.getModel());
            return true;
        }
        System.out.printf("В автобусе %s больще нет пассажиров.\n", this.getModel());
        return false;

    }
}

class TransportAppMain{
    public static void main(String[] args) {
        Bus bus = new Bus("Bus-X1", 1999, 10);

        System.out.println(bus.toString());
        bus.start();
        bus.stop();

        System.out.println(bus.getModel());
        System.out.println("bus.getCapacity() " + bus.getCapacity());

        System.out.println("========================");

        Bus bus1 = new Bus("Bus-X2", 2024, 3);
        System.out.println(bus1.takePassenger());
        System.out.println(bus1.takePassenger());
        System.out.println(bus1.takePassenger());

        bus1.dropPassenger();
        bus1.dropPassenger();
        bus1.dropPassenger();
        bus1.dropPassenger();
        bus1.dropPassenger();




    }





    }

