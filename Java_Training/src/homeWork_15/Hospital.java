package homeWork_15;

public class Hospital {

    String hospitalType;
    String location;
    String[] departments;
    boolean emergencyDepartment;
    boolean pharmacy;
    String workingHours;
    String[] equipmen;
    float patientRatings;
    int patientCapacity;
    int hospitalOccupancy;

    public Hospital(String hospitalType, String location, String[] departments, String workingHours, String[] equipmen,
                    boolean emergencyDepartment, boolean pharmacy, float patientRatings, int patientCapacity, int hospitalOccupancy) {
        this.hospitalType = hospitalType;
        this.location = location;
        this.departments = departments;
        this.workingHours = workingHours;
        this.equipmen = equipmen;
        this.emergencyDepartment = emergencyDepartment;
        this.pharmacy = pharmacy;
        this.patientRatings = patientRatings;
        this.patientCapacity = patientCapacity;
        this.hospitalOccupancy = hospitalOccupancy;


    }

}

