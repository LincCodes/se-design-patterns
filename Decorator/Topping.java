public class Topping extends DebonairsPizza{
    DebonairsPizza pizza;
    public Topping(DebonairsPizza pizza) {
        this.pizza = pizza;
    }
    
    @Override
    public void description() {
        pizza.description();
    }

    @Override
    public double cost() {
        return pizza.cost();
    }
}
