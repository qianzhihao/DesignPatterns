package patterns.abstractFactory.example;

import patterns.factoryMethod.AbstractBlackHuman;

public class MaleBlackHuman extends AbstractBlackHuman {
    @Override
    public void getSex() {
        System.out.println("黑种人男性");
    }
}
