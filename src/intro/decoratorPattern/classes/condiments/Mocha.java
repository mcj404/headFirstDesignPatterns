package intro.decoratorPattern.classes.condiments;

import intro.decoratorPattern.abstractClasses.Beverage;
import intro.decoratorPattern.abstractClasses.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
