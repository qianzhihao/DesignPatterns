package patterns.abstractFactory.example;

import patterns.factoryMethod.Human;
import patterns.factoryMethod.*;
import patterns.factoryMethod.MaleBlackHuman;
import patterns.factoryMethod.MaleWhiteHuman;
import patterns.factoryMethod.MaleYellowHuman;

public class MaleFactory implements HumanFactory {
    //生产出黑人男性
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
    //生产出白人男性
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }
    //生产出黄种人男性
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

}
