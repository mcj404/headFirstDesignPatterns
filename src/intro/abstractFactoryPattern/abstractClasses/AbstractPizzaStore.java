package intro.abstractFactoryPattern.abstractClasses;

public abstract class AbstractPizzaStore {

    public AbstractPizza orderPizza(String type) {
        AbstractPizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract AbstractPizza createPizza(String type);
}
