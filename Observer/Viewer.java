public class Viewer implements Observer{

    String name;
    Viewer(String name){
        this.name = name;
    }
    @Override
    public void update(String message){
        System.out.println("Hi " + name + ", " + message); 
    }
}