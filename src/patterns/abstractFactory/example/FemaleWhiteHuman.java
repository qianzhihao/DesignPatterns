package patterns.abstractFactory.example;

import patterns.factoryMethod.AbstractWhiteHuman;

public class FemaleWhiteHuman extends AbstractWhiteHuman {
    @Override
    public void getSex() {
        System.out.println("白种人女性");
    }
}
