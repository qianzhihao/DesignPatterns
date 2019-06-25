package patterns.pk.wrapping.decorator;

public class HotAir extends Decorator {
    public HotAir(IStar _star) {
        super(_star);
    }

    public void act() {
        System.out.println("before the Drama: Quarrel for a bit, no role can't I play!");
        super.act();
    }
}
