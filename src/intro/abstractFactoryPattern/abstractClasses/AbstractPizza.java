package intro.abstractFactoryPattern.abstractClasses;

import intro.abstractFactoryPattern.ingredients.interfaces.*;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPizza {
    public String name;

    public Dough dough;
    public Sauce sauce;
    public Veggies veggies[];
    public Cheese cheese;
    public Pepperoni pepperoni;
    public Clams clams;

    public List<String> toppings = new ArrayList<>();

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 mins at 350");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
