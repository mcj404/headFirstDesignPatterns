package intro.abstractFactoryPattern;

import intro.abstractFactoryPattern.abstractClasses.AbstractPizza;
import intro.abstractFactoryPattern.abstractClasses.PizzaIngredientFactory;

public class ClamPizza extends AbstractPizza {

    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clams = ingredientFactory.createClam();
    }
}
