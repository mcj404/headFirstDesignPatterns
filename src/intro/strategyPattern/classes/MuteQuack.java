package intro.strategyPattern.classes;

import intro.strategyPattern.interfaces.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
