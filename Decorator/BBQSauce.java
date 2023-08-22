public class BBQSauce extends Topping{

    public BBQSauce(DebonairsPizza pizza) {
        super(pizza);
    }

    @Override
    public void description() {
        super.description();
        System.out.println("with BBQ Sauce");
    }

    @Override
    public double cost() {
        return super.cost() + 12;
    }
    
}