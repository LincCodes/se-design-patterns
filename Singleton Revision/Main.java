public class Main {
    public static void main(String[] args) {

        if (University.getInstance().equals(University.getInstance())) {
            System.out.println("They are the same.");
        } else {
            System.out.println("They are not the same.");
        }
    }
}
