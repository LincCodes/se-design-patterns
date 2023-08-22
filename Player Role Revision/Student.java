public class Student {
    Role role;
    String name;
    Student(String name, Role role) {
        this.role = role;
        this.name = name;
        System.out.println(this.name +"'s new time is " + role.time());
    }

    void setRole(Role role) {
        this.role = role;
        System.out.println(this.name +"'s new time is " + role.time());
    }
}
