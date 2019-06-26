package patterns.pk.wrapping.bridge;

public abstract class AbsStar {
    protected final AbsAction action;
    public AbsStar(AbsAction _action) {
        this.action = _action;
    }

    public void doJob() {
        action.desc();
    }
}
