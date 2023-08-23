import java.util.ArrayList;

public class Manager extends Employee{

    Manager(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    ArrayList<Employee> employees = new ArrayList<>();

    @Override
    void work() {
        // TODO Auto-generated method stub
        System.out.println("Worker under manager are: ");
        for (Employee employee : employees) {
            System.out.println(employee.name);
        }
        
    }

    void addEmployee(Employee employee) {
        employees.add(employee);
    }
    void removeEmployee(Employee employee) {
        employees.remove(employee);
    }
    
}
