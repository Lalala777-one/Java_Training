package homework21.task2;

public class Computer {

private String model;

    private Storage storage;
    private Processor processor;
    private Memory memory;

    public Computer(String model,Storage storage ) {
        this.model = model;
        this.storage = storage;
        processor = new Processor("Intel Core", "i7", 8, "ARM");
        memory = new Memory("Corsair", "V6", 16, 8);

    }

    public String toString(){
        StringBuilder sb = new StringBuilder("Computer: { ");
        sb.append("Processor model: ").append(processor.getModel() + " ");
        sb.append("Memory capacity: ").append(memory.getCapacity() + " ");
        sb.append("Storage capacity: ").append(storage.getCapacity() );
        sb.append("}");

        return sb.toString();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

class Test{

    public static void main(String[] args) {
        Storage storage = new Storage("Lg", "V6", "Korea", 16);
        Computer computer1 = new Computer("Samsung", storage );
        System.out.println(computer1.toString());

    }
}
