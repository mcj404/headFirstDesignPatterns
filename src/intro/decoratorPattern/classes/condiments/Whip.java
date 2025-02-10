package intro.decoratorPattern.classes.condiments;

import intro.decoratorPattern.abstractClasses.Beverage;
import intro.decoratorPattern.abstractClasses.CondimentDecorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " and whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
