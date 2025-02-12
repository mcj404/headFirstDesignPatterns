package intro.abstractFactoryPattern;

import intro.abstractFactoryPattern.abstractClasses.AbstractPizza;
import intro.abstractFactoryPattern.abstractClasses.PizzaIngredientFactory;

public class CheesePizza extends AbstractPizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
    }
}
