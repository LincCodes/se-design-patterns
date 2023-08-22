public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();
        Vehicle vehicle = factory.create("motorbike");
        vehicle.sound();
    }
}
