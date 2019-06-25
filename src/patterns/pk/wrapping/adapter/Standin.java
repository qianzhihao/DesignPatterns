package patterns.pk.wrapping.adapter;

public class Standin implements IStar {

    private IActor actor;
    public Standin(IActor _actor) {
        this.actor = _actor;
    }

    @Override
    public void act(String context) {
        actor.playact(context);
    }
}
