public class Delegator {
    SumOfTwo add;
    public double delegate(double x, double y){
        add = new SumOfTwo();
        return add.sum(x, y);
    }
}
