package Ch3.Starbuzz;

public class Espresso extends Beverage {
    public Espresso() {
        description = "";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
