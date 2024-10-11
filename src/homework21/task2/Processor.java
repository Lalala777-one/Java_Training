package homework21.task2;

public class Processor extends Component{

    private int cores;
    private String architecture;

    public Processor(String brand, String model, int cores, String architecture) {
        super(brand, model);
        this.cores = cores;
        this.architecture = architecture;
    }

    public int getCores() {
        return cores;
    }

    public String getArchitecture() {
        return architecture;
    }
}
