public class University {
    public static University instance;

    private University() {
    }

    public static University getInstance() {
        if (instance == null) {
            instance = new University();
            return instance;
        }else{
            return instance;
        }
    }
}