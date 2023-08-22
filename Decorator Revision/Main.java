public class Main {
    public static void main(String[] args) {
        // Pizza pizza2 = new Pizza("On Real double combo", 60);
        Pizza pizza = new Pizza("On the double promo pizza", 220);
       /*  pizza.description();
        System.out.println("K" + pizza.cost());
        System.out.println(); */

        Cheese cheese = new Cheese(pizza);
        /* cheese.description();
        System.out.println("K" + cheese.cost());
        System.out.println(); */

        BBQSauce bbqSauce = new BBQSauce(cheese);
       /*  bbqSauce.description();
        System.out.println("K" + bbqSauce.cost());
        System.out.println(); */

        Chicken chicken = new Chicken(bbqSauce);
        chicken.description();
        System.out.println("K" + chicken.cost());
        System.out.println();
    }
}
