package Ch4_Factory.FactoryMethod.Stores;

import Ch4_Factory.FactoryMethod.Pizzas.Chicago.ChicagoStyleCheesePizza;
import Ch4_Factory.FactoryMethod.Pizzas.Chicago.ChicagoStyleClamPizza;
import Ch4_Factory.FactoryMethod.Pizzas.Chicago.ChicagoStylePepperoniPizza;
import Ch4_Factory.FactoryMethod.Pizzas.Chicago.ChicagoStyleVeggiePizza;
import Ch4_Factory.FactoryMethod.Pizzas.Pizza;
import Ch4_Factory.FactoryMethod.PizzaType;

public class ChicagoPizzaStore extends PizzaStore {

    public Pizza createPizza(PizzaType pizzaType) {
        switch (pizzaType) {
            case CHEESE:
                return new ChicagoStyleCheesePizza();
            case VEGGIE:
                return new ChicagoStyleVeggiePizza();
            case CLAM:
                return new ChicagoStyleClamPizza();
            case PEPPERONI:
                return new ChicagoStylePepperoniPizza();
            default:
                return null;
        }
    }
}
