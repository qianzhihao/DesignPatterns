package patterns.abstractFactory.example;

public class MaleWhiteHuman extends AbstractWhiteHuman {
    @Override
    public void getSex() {
        System.out.println("白种人男性");
    }
}
