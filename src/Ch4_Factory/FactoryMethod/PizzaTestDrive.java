package Ch4_Factory.FactoryMethod;

import Ch4_Factory.FactoryMethod.Stores.ChicagoPizzaStore;
import Ch4_Factory.FactoryMethod.Stores.NYPizzaStore;
import Ch4_Factory.FactoryMethod.Pizzas.Pizza;
import Ch4_Factory.FactoryMethod.Stores.PizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

//        pizza = nyStore.orderPizza(PizzaType.CLAM);
//        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
//
//        pizza = chicagoStore.orderPizza(PizzaType.CLAM);
//        System.out.println("Joel ordered a " + pizza.getName() + "\n");
//
//        pizza = nyStore.orderPizza(PizzaType.PEPPERONI);
//        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
//
//        pizza = chicagoStore.orderPizza(PizzaType.PEPPERONI);
//        System.out.println("Joel ordered a " + pizza.getName() + "\n");
//
//        pizza = nyStore.orderPizza(PizzaType.VEGGIE);
//        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
//
//        pizza = chicagoStore.orderPizza(PizzaType.VEGGIE);
//        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}