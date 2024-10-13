package homework22.Task1.task2;

public class VehicleTestApp {
    public static void main(String[] args) {


        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car("black", 1999, "Honda M6", "Gasoline");
        vehicles[1] = new Bicycle("red", 2024, "Turbo-78");
        vehicles[2] = new Motorcycle("white", 2005, "Reggi-R5","V-Twin" );

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].startEngine();

        }


    }
}
