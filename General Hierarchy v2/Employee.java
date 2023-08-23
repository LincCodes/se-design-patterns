public abstract class Employee {
    String name;
    Employee(String name){
        this.name = name;
    }
    abstract void work();
}