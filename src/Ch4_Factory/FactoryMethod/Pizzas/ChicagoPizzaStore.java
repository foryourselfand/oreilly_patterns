package Ch4_Factory.FactoryMethod.Pizzas;

import Ch4_Factory.FactoryMethod.PizzaStore;
import Ch4_Factory.FactoryMethod.Pizzas.Chicago.ChicagoStyleCheesePizza;
import Ch4_Factory.FactoryMethod.Pizzas.Chicago.ChicagoStyleClamPizza;
import Ch4_Factory.FactoryMethod.Pizzas.Chicago.ChicagoStylePepperoniPizza;
import Ch4_Factory.FactoryMethod.Pizzas.Chicago.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}
