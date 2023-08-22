public class Main {
    public static void main(String[] args) {

        // Roles played by User
        Customer customer = new Customer();

        // User
        Player player1 = new Player(customer);

        player1.play();
        player1.changeRole(new Employee());
        player1.play();
    }
}
