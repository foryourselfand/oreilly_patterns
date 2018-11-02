package Ch1;

import Ch1.Fly.FlyWithWings;
import Ch1.Quack.Quack;

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
