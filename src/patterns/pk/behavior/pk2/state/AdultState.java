package patterns.pk.behavior.pk2.state;

public class AdultState extends HumanState {
    @Override
    public void work() {
        System.out.println("Adults' work is to make more money!");
        super.human.setState(Human.OLD_STATE);
    }
}
