package Ch1_Strategy;

import Ch1_Strategy.Ducks.Duck;
import Ch1_Strategy.Ducks.MallardDuck;
import Ch1_Strategy.Ducks.ModelDuck;
import Ch1_Strategy.Fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
