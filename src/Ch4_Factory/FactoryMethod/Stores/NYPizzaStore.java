package Ch4_Factory.FactoryMethod.Stores;

import Ch4_Factory.FactoryMethod.Pizzas.NY.NYStyleCheesePizza;
import Ch4_Factory.FactoryMethod.Pizzas.NY.NYStyleClamPizza;
import Ch4_Factory.FactoryMethod.Pizzas.NY.NYStylePepperoniPizza;
import Ch4_Factory.FactoryMethod.Pizzas.NY.NYStyleVeggiePizza;
import Ch4_Factory.FactoryMethod.Pizzas.Pizza;
import Ch4_Factory.FactoryMethod.PizzaType;

public class NYPizzaStore extends PizzaStore {

    public Pizza createPizza(PizzaType pizzaType) {
        switch (pizzaType) {
            case CHEESE:
                return new NYStyleCheesePizza();
            case VEGGIE:
                return new NYStyleVeggiePizza();
            case CLAM:
                return new NYStyleClamPizza();
            case PEPPERONI:
                return new NYStylePepperoniPizza();
            default:
                return null;
        }
    }
}