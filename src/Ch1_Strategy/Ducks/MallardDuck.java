package Ch1_Strategy.Ducks;

import Ch1_Strategy.Fly.FlyWithWings;
import Ch1_Strategy.Quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm real Mallard duck");
    }
}
