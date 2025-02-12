package intro.abstractFactoryPattern;

import intro.abstractFactoryPattern.abstractClasses.AbstractPizza;
import intro.abstractFactoryPattern.abstractClasses.AbstractPizzaStore;
import intro.abstractFactoryPattern.abstractClasses.PizzaIngredientFactory;

public class NYAbstractPizzaStore extends AbstractPizzaStore {

    @Override
    public AbstractPizza createPizza(String type) {
        AbstractPizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam pizza");
        }
        return pizza;
    }
}
