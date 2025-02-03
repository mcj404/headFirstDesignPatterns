package intro.strategyPattern.classes;

import intro.strategyPattern.interfaces.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    /**
     * Performs the action of flying.
     */
    public void fly() {
        System.out.println("I'm flying!!!");
    }
}
