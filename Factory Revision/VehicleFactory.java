public class VehicleFactory implements Factory{

    @Override
    public Vehicle create(String name) {
        // TODO Auto-generated method stub
        if (name.equals("car")) {
            return new Car();
        } else if (name.equals("motorbike")){
            return new Motorbike();
        }else{
            return null;
        }
    }
    
}
