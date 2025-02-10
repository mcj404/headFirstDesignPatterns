package intro.decoratorPattern.classes.condiments;

import intro.decoratorPattern.abstractClasses.Beverage;
import intro.decoratorPattern.abstractClasses.CondimentDecorator;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " and soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }
}
