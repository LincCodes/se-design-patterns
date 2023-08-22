public class Pizza extends DebonairsPizza{
    String descript;
    int costing;

    Pizza(String descript, int costing) {
        this.descript = descript;
        this.costing = costing;
    }

    @Override
    public void description() {
        System.out.println(this.descript);
    }

    @Override
    public double cost() {
        return this.costing;
    }
}