package intro.factoryPattern.concreteClasses;

import intro.factoryPattern.abstractClasses.Pizza;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Granted Reggiano Cheese");
    }
}
