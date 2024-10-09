package lesson_20.transport;

public class Train extends Vehicle{

    private int capacity;
    private int countPassengers;

    private int countWagons;
    private final int wagonCapacity;

    public Train(String model, int year, int countWagons, int wagonCapacity) {
        super(model, year);

        this.countWagons = countWagons;
        this.wagonCapacity = wagonCapacity;
        calculateCapacity();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public int getCountWagons() {
        return countWagons;
    }

    public int getWagonCapacity() {
        return wagonCapacity;
    }

    public void setCountWagons(int countWagons) {
        this.countWagons = countWagons;
        calculateCapacity();
    }

    private void calculateCapacity(){
        this.capacity = countWagons * wagonCapacity;
    }
}

class TrainMainApp{
    public static void main(String[] args) {
        Train train = new Train("Scoda", 2022, 4, 40);

        System.out.println(train.toString());;
        train.start();
        train.stop();
        System.out.println(train.getModel());

        System.out.println("Capacity: " + train.getCapacity());

        train.setCountWagons(3);
        System.out.println("Capacity: " + train.getCapacity());
    }
}
