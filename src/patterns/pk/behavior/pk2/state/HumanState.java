package patterns.pk.behavior.pk2.state;

public abstract class HumanState {
    protected Human human;

    public void setHuman(Human human) {
        this.human = human;
    }

    public abstract void work();
}
