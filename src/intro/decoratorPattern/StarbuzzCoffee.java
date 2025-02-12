package intro.decoratorPattern;

import intro.decoratorPattern.abstractClasses.Beverage;
import intro.decoratorPattern.classes.coffees.DarkRoast;
import intro.decoratorPattern.classes.coffees.Espresso;
import intro.decoratorPattern.classes.condiments.Mocha;
import intro.decoratorPattern.classes.condiments.Soy;
import intro.decoratorPattern.classes.condiments.SteamedMilk;
import intro.decoratorPattern.classes.condiments.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());


        Beverage houseBlend = new DarkRoast();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Soy(houseBlend);
        houseBlend = new Whip(houseBlend);
        houseBlend = new SteamedMilk(houseBlend);
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
    }
}
