package Ch4_Factory.AbstractFactory.Stores;

import Ch4_Factory.AbstractFactory.Factories.*;
import Ch4_Factory.AbstractFactory.PizzaType;
import Ch4_Factory.AbstractFactory.Pizzas.*;

public class ChicagoPizzaStore extends PizzaStore {

    protected Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new ChicagoPizzaIngredientFactory();

        switch (pizzaType) {
            case CHEESE:

                pizza = new CheesePizza(ingredientFactory);

                break;
            case VEGGIE:

                pizza = new VeggiePizza(ingredientFactory);

                break;
            case CLAM:

                pizza = new ClamPizza(ingredientFactory);

                break;
            case PEPPERONI:

                pizza = new PepperoniPizza(ingredientFactory);

                break;
        }
        pizza.setName("Chicago Style " + pizzaType.name() + " Pizza");

        return pizza;
    }
}
