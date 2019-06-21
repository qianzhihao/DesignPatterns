package patterns.pk.behavior.pk2.state;

public class ChildState extends HumanState {
    @Override
    public void work() {
        System.out.println("Children's work is to playing games!");
        super.human.setState(Human.ADULT_STATE);
    }
}
