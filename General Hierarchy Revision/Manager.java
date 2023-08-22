import java.util.ArrayList;

public class Manager extends Employee {
    ArrayList<Employee> employees = new ArrayList<Employee>();

    Manager(String name) {
        super(name);
    }

    public void work() {
        System.out.println("I am a Manager");
    }

    void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("You have added " + employee.name);
    }
    void removeEmployee(Employee employee) {
        employees.remove(employee);
        System.out.println("You have removed " + employee.name);
    }
}
