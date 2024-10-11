package lesson_21;

public class BusDriver {

    private static int idCounter = 1;
    private final int id;
    private String name;
    private String licenseNumber;

    public BusDriver(String name, String licenseNumber){
        this.id = idCounter++;  // сначала присвоится текущее значение каунтера, а потом увеличится
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("BusDriver : {");
        sb.append("id: ").append(id);
        sb.append(", name: ").append(name);
        sb.append("}");

        return sb.toString();

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
}
