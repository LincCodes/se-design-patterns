public class Main {
    public static void main(String[] args) {
        Player player = new Player(new FullTime());
        player.getRole();
        
        player.setRole(new PartTime());
        player.getRole();

    }
}
