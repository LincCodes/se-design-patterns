public class Viewer implements Observer{

    String name;
    Viewer(String name){
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(this.name +" updated");
    }
    
}
