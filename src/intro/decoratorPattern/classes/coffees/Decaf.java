package intro.decoratorPattern.classes.coffees;

import intro.decoratorPattern.abstractClasses.Beverage;

public class Decaf extends Beverage {

    public Decaf(){
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
