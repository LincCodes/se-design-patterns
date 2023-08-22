public class Player {
    Role role;
    Player(Role role){
        this.role = role;
    }

    void changeRole(Role role){
        this.role = role;
    }
    
    void play(){
        role.role();
    }
}