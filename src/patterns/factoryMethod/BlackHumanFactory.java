package patterns.factoryMethod;

public class BlackHumanFactory extends AbstractHumanFactory{
    public Human createHuman() {
        return new BlackHuman();
    }
}
