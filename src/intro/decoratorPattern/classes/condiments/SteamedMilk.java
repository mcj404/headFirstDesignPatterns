package intro.decoratorPattern.classes.condiments;

import intro.decoratorPattern.abstractClasses.Beverage;
import intro.decoratorPattern.abstractClasses.CondimentDecorator;

public class SteamedMilk extends CondimentDecorator {

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " and steamed milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
