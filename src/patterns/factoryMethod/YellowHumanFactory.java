package patterns.factoryMethod;

public class YellowHumanFactory extends AbstractHumanFactory{
    public Human createHuman() {
        return new YellowHuman();
    }
}
