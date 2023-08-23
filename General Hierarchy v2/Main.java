public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Dave");

        manager.addEmployee(new Dev("Bob"));
        manager.addEmployee(new Dev("Builder"));
        manager.addEmployee(new Dev("Naruto"));
        manager.addEmployee(new Lawyer("Michael"));
        manager.addEmployee(new Lawyer("Adam"));

        manager.work();
    }
}
