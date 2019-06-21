package patterns.pk.behavior.pk2.state;

public class Human {
    public static final HumanState CHILD_STATE = new ChildState();
    public static final HumanState ADULT_STATE = new AdultState();
    public static final HumanState OLD_STATE = new OldState();

    private HumanState state;

    public void setState(HumanState _state) {
        this.state = _state;
        this.state.setHuman(this);
    }

    public void work() {
        this.state.work();
    }

}
