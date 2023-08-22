public class Cheese extends Topping{

    public Cheese(DebonairsPizza pizza) {
        super(pizza);
    }

    @Override
    public void description() {
        super.description();
        System.out.println("with Cheese");
    }

    @Override
    public double cost() {
        return super.cost() + 10;
    }
    
}
