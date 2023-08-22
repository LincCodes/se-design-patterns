public class Chicken extends Topping{

    public Chicken(DebonairsPizza pizza) {
        super(pizza);
    }

    @Override
    public void description() {
        super.description();
        System.out.println("with Chicken");
    }

    @Override
    public double cost() {
        return super.cost() + 16;
    }
    
}
