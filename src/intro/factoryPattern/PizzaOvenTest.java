package intro.factoryPattern;

import intro.factoryPattern.abstractClasses.Pizza;
import intro.factoryPattern.abstractClasses.PizzaStore;
import intro.factoryPattern.concreteClasses.ChicagoPizzaStore;
import intro.factoryPattern.concreteClasses.NYPizzaStore;

public class PizzaOvenTest {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
