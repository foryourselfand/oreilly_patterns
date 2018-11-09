package Ch7_Adapter.Birds.Adapters;

import Ch7_Adapter.Birds.Ducks.Duck;
import Ch7_Adapter.Birds.Turkeys.Turkey;

public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
