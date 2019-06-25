package patterns.pk.wrapping.proxy;

public class Agent implements IStar {

    private IStar star;
    public Agent(IStar _star) {
        this.star = _star;
    }

    @Override
    public void sign() {
        star.sign();
    }
}
