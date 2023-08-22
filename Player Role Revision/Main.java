public class Main {
    public static void main(String[] args) {
        Student student = new Student("Linc", new PartTime());
        System.out.println();
        student.setRole(new FullTime());

    }
}
