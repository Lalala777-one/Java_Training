package lesson_21;

public class Bus {

    /*
    ДЛЯ СОЗДАНИЯ СВЯЗИ ТИПА HAS A МЫ ОПРЕДЕЛЯЕМ ПОЛЕ КЛАССА КОТОРОЕ БУДЕТ
    ХРАНИТЬ ССЫЛКУ НА ОБЪЕКТ ДРУГОГО КЛАССА
     */

    private static int counter = 1;

    private final int id;

    private BusDriver driver; // АГРЕГАЦИЯ - МЯГКАЯ СВЯЗЬ
    private  Autopilot autopilot; //  КОМПОЗИЦИЯ - ЖЕСТКАЯ НЕРАЗРЫВНАЯ СВЯЗЬ

    public void instalNewAutopilot(String softwareVersion){
        this.autopilot = new Autopilot(softwareVersion);

    }

    private final int capacity;
    private int countPassenger;

    public Bus(BusDriver busDriver, int capacity) {
        this.id = counter;
        counter++;
        this.capacity = capacity;
        this.driver = busDriver;
        this.autopilot = new Autopilot("AP-v001");
    }

    public String toString(){
        return "Bus: {id: " + id + ", capacity: " + capacity +
                ": driver: " + autopilot.toString() + "}";
    }

    public int getId() {
        return id;
    }

    public BusDriver getDriver() {
        return driver;
    }

    public Autopilot getAutopilot() {
        return autopilot;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassenger() {
        return countPassenger;
    }

    public void setDriver(BusDriver driver) {
        this.driver = driver;
    }


}

    class BusTest{
        public static void main(String[] args) {

            BusDriver busDriver = new BusDriver("John", "LN-1234");

            Bus bus = new Bus(busDriver, 24);

            BusDriver busDriver1 = new BusDriver("Ben", "LN-3455");

            Bus bus1 = new Bus(busDriver1, 34);



            System.out.println("bus: " + bus1.toString());
            System.out.println("bus: " + bus1.toString());

            bus1.setDriver(busDriver);
            System.out.println("bus1.setDriver(busDriver) " + bus1.toString());
        }
    }

