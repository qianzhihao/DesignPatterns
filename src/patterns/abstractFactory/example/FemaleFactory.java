package patterns.abstractFactory.example;

import patterns.factoryMethod.FemaleBlackHuman;
import patterns.factoryMethod.FemaleWhiteHuman;
import patterns.factoryMethod.FemaleYellowHuman;
import patterns.factoryMethod.Human;
import patterns.factoryMethod.*;

public class FemaleFactory implements HumanFactory {
    //生产出黑人女性
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }
    //生产出白人女性
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }
    //生产出黄种人女性
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

}
