package Ch7_Adapter.Birds.Adapters;

import Ch7_Adapter.Birds.Ducks.Duck;
import Ch7_Adapter.Birds.Turkeys.Turkey;

public class DuckAdapter implements Turkey {
    Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        if (((int) (Math.random() * 5)) == 1)
            duck.fly();
    }
}
