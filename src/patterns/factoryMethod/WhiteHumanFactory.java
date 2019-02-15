package patterns.factoryMethod;

public class WhiteHumanFactory extends AbstractHumanFactory{
    public Human createHuman() {
        return new WhiteHuman();
    }
}
