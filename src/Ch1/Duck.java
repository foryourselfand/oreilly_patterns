package Ch1;

import Ch1.Fly.FlyBehavior;
import Ch1.Quack.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    public void perfomFly(){
        flyBehavior.fly();
    }

    public void perfomQuack() {
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float");
    }
}
