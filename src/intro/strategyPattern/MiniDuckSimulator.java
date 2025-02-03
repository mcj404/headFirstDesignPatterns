package intro.strategyPattern;

import intro.strategyPattern.classes.*;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.setFlyBehaviour(new FlyNoWay());
        model.setQuackBehaviour(new MuteQuack());
        model.performFly();
        model.performQuack();
    }
}
