package intro.abstractFactoryPattern;

import intro.abstractFactoryPattern.abstractClasses.AbstractPizza;
import intro.abstractFactoryPattern.abstractClasses.AbstractPizzaStore;
import intro.abstractFactoryPattern.abstractClasses.PizzaIngredientFactory;

public class ChicagoAbstractPizzaStore extends AbstractPizzaStore {
    @Override
    public AbstractPizza createPizza(String type) {
        AbstractPizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam pizza");
        }
        return pizza;
    }
}
