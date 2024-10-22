package lesson_28.equels;

import lists.MyArrayList;
import lists.MyList;

public class EmployeeApp {

    public static void main(String[] args) {
        MyList<Employee> employees = new MyArrayList<>();
        Employee employee = new Employee("Tom", "Müller", "18.12.1994");
        Employee employee1 = new Employee("Ben", "Schiller", "21.07.1991");
        Employee employee2 = new Employee("Ben", "Schiller", "15.01.2001");
        Employee employee3 = new Employee("Ben", "Schiller", "15.01.2001");

        System.out.println("employee1 == employee " + (employee1 == employee)); // сравниваются ссылки на объекты
        System.out.println("employee2.equals(employee3) " + (employee2.equals(employee3))); // true
        System.out.println("employee1.equals(employee2) " + (employee1.equals(employee2))); // false
    }
}
