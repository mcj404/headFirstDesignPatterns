package intro.strategyPattern.classes;

import intro.strategyPattern.interfaces.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {

    /**
     * This method provides the fly behavior for objects that cannot fly.
     * It outputs a message indicating the inability to fly.
     */
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

}
