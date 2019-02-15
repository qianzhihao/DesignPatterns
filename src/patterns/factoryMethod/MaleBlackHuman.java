package patterns.factoryMethod;

public class MaleBlackHuman extends AbstractBlackHuman {
    @Override
    public void getSex() {
        System.out.println("黑种人男性");
    }
}