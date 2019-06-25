package patterns.pk.wrapping.proxy;

public class Singer implements IStar {
    @Override
    public void sign() {
        System.out.println("Star's Sign: I'm a Super Star!");
    }
}
