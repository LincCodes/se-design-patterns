public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Linc");
        Developer developer = new Developer("Codes");
        manager.addEmployee(developer);
    }
}
