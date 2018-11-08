package Ch4_Factory.AbstractFactory;


import Ch4_Factory.AbstractFactory.Pizzas.Pizza;
import Ch4_Factory.AbstractFactory.Stores.*;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Joel ordered a " + pizza + "\n");

//        pizza = nyStore.orderPizza(PizzaType.CLAM);
//        System.out.println("Ethan ordered a " + pizza + "\n");
//
//        pizza = chicagoStore.orderPizza(PizzaType.CLAM);
//        System.out.println("Joel ordered a " + pizza + "\n");
//
//        pizza = nyStore.orderPizza(PizzaType.PEPPERONI);
//        System.out.println("Ethan ordered a " + pizza + "\n");
//
//        pizza = chicagoStore.orderPizza(PizzaType.PEPPERONI);
//        System.out.println("Joel ordered a " + pizza + "\n");
//
//        pizza = nyStore.orderPizza(PizzaType.VEGGIE);
//        System.out.println("Ethan ordered a " + pizza + "\n");
//
//        pizza = chicagoStore.orderPizza(PizzaType.VEGGIE);
//        System.out.println("Joel ordered a " + pizza + "\n");
    }
}