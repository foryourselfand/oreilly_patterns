package Ch4_Factory.AbstractFactory.Stores;

import Ch4_Factory.AbstractFactory.Factories.NYPizzaIngredientFactory;
import Ch4_Factory.AbstractFactory.Factories.PizzaIngredientFactory;
import Ch4_Factory.AbstractFactory.PizzaType;
import Ch4_Factory.AbstractFactory.Pizzas.*;

public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory();

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
        pizza.setName("New York Style " + pizzaType.name() + " Pizza");

        return pizza;
    }
}