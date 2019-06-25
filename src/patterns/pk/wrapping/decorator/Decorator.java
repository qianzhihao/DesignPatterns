package patterns.pk.wrapping.decorator;

public class Decorator implements IStar {

    private IStar star;
    public Decorator(IStar _star) {
        this.star = _star;
    }

    @Override
    public void act() {
        this.star.act();
    }
}
