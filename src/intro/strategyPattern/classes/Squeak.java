package intro.strategyPattern.classes;

import intro.strategyPattern.interfaces.QuackBehaviour;

public class Squeak implements QuackBehaviour {

    /**
     * The Squeak behaviour is to produce a Squeak sound when
     * a Duck is asked to quack.
     */
    @Override
    public void quack() {
        System.out.println("Rubber Duck Squeaking");
    }
}
