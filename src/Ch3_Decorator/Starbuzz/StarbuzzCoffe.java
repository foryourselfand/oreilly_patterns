package Ch3_Decorator.Starbuzz;

import Ch3_Decorator.Starbuzz.Component.Beverage;
import Ch3_Decorator.Starbuzz.ConcreteComponents.DarkRoast;
import Ch3_Decorator.Starbuzz.ConcreteComponents.Espresso;
import Ch3_Decorator.Starbuzz.ConcreteComponents.HouseBlend;
import Ch3_Decorator.Starbuzz.ConcreteDecorators.Milk;
import Ch3_Decorator.Starbuzz.ConcreteDecorators.Mocha;
import Ch3_Decorator.Starbuzz.ConcreteDecorators.Soy;
import Ch3_Decorator.Starbuzz.ConcreteDecorators.Whip;

public class StarbuzzCoffe {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() +
                " $" + beverage1.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() +
                " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() +
                " $" + beverage3.cost());

        Beverage beverage4 = new HouseBlend();
        beverage4.setSize(Beverage.Size.GRANDE);
        beverage4 = new Milk(beverage4);
        beverage4 = new Milk(beverage4);
        beverage4 = new Soy(beverage4);
        System.out.println(beverage4.getDescription() +
                " $" + beverage4.cost());
    }
}
