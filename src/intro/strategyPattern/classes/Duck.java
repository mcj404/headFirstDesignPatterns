package intro.strategyPattern.classes;

import intro.strategyPattern.interfaces.FlyBehaviour;
import intro.strategyPattern.interfaces.QuackBehaviour;

public abstract class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck() {}

    /**
     * Sets the fly behavior for the duck.
     *
     * @param fb the FlyBehaviour implementation to be used by the duck
     */
    public void setFlyBehaviour(FlyBehaviour fb) { flyBehaviour = fb; }

    /**
     * Sets the quack behavior for the duck.
     *
     * @param qb the QuackBehaviour implementation to be used by the duck
     */
    public void setQuackBehaviour(QuackBehaviour qb) { quackBehaviour = qb; }

    /**
     * Instructs the duck to fly. The actual implementation of flight is
     * determined by the FlyBehaviour instance set by {@link #setFlyBehaviour}.
     */
    public void performFly() { flyBehaviour.fly(); }

    /**
     * Instructs the duck to quack. The actual sound and manner of quacking
     * are determined by the QuackBehaviour instance set by {@link #setQuackBehaviour}.
     */
    public void performQuack() { quackBehaviour.quack(); }

    /**
     * Causes the duck to swim. This behavior is innate to all ducks,
     * even decoys.
     */
    public void swim() { System.out.println("All ducks float, even decoys!"); }

    public abstract void display();


}
