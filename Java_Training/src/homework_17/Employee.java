package homework_17;

public class Employee {

    private String name;
    private int age;
    private double salary;



    public Employee(String name, int age, double salary) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("The name must not be empty.");
        }
        if(age < 18){
            throw new IllegalArgumentException("The employee's age cannot be less than 18.");
        }
        if(salary <= 0){
            throw new IllegalArgumentException("The salary cannot be less than 0.0 ");
        }
            this.name = name;
            this.age = age;
            this.salary = salary;
        }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

   /* public void setName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("An empty name was set");

        } else {
            this.name = name;
        }
    }

    */

    public void setName(String name){
        if(!(name.isEmpty())){
           this.name = name;
        }
        System.out.println("\"An empty name was set\"");
    }



    public void setAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("\"The employee's age cannot be less than 18.\"");
        } else {
            this.age = age;
        }
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            throw new IllegalArgumentException("\"The salary cannot be less than 0.0 \"");
        } else {
            this.salary = salary;
        }
    }

    public String toString() {
        return String.format("Employee: %s, Age: %d, Salary: %.2f", name, age, salary);
    }


    public String info(){
        System.out.println(this.toString());
    }
}


class Test {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Tom", 25, 2000.99);
        System.out.println(emp1.info());

        emp1.setName("");

    }
}
