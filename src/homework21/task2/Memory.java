package homework21.task2;

public class Memory extends Component{

    private int capacity;
    private int availableMemory;

    public Memory(String brand, String model, int capacity, int availableMemory) {
        super(brand, model);
        this.capacity = capacity;
        this.availableMemory = availableMemory;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getAvailableMemory() {
        return availableMemory;
    }
}
