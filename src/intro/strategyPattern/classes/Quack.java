package intro.strategyPattern.classes;

import intro.strategyPattern.interfaces.QuackBehaviour;

public class Quack implements QuackBehaviour {
    /**
     * Provides a default implementation of the quacking sound, which is to
     * simply print out the string "Ducks Quacking".
     */
    public void quack() {
        System.out.println("Ducks Quacking");
    }
}
