package intro.abstractFactoryPattern;

import intro.abstractFactoryPattern.abstractClasses.AbstractPizza;
import intro.abstractFactoryPattern.abstractClasses.AbstractPizzaStore;

public class AbstractPizzaOvenTest {
    public static void main(String[] args) {
        AbstractPizzaStore nyPizzaStore = new NYAbstractPizzaStore();
        AbstractPizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
    }
}
