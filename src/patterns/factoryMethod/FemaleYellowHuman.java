package patterns.factoryMethod;

public class FemaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("黄种人女性");
    }
}
