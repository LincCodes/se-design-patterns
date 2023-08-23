public class Player {
    Role role;


    Player(Role role) {
        this.role = role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void getRole() {
        this.role.role();
    }

}