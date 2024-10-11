package homework21.task2;

public class Storage extends Component{

    private String manufacturer;
    private int capacity;

    public Storage(String brand, String model, String manufacturer, int capacity) {
        super(brand, model);
        this.manufacturer = manufacturer;
        this.capacity = capacity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


}
