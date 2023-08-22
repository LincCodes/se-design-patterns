public class Adapter extends Super{
    Adapter(String name){
        super(name);
    }
    SumOfTwo add;
    public double adapter(double x, double y){
        add = new SumOfTwo();
        return add.sum(x, y);
    }
}
