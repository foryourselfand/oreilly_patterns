package Ch4_Factory.FactoryMethod.Pizzas;

import Ch4_Factory.FactoryMethod.PizzaStore;
import Ch4_Factory.FactoryMethod.Pizzas.NY.NYStyleCheesePizza;
import Ch4_Factory.FactoryMethod.Pizzas.NY.NYStyleClamPizza;
import Ch4_Factory.FactoryMethod.Pizzas.NY.NYStylePepperoniPizza;
import Ch4_Factory.FactoryMethod.Pizzas.NY.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;
    }
}