package patterns.pk.wrapping.decorator;

public class Deny extends Decorator {
    public Deny(IStar _star) {
        super(_star);
    }

    public void act() {
        super.act();
        System.out.println("After the Drama: All kinds of repudiation!");
    }
}
