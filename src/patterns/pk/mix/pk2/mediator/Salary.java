package patterns.pk.mix.pk2.mediator;

public class Salary extends AbsColleague implements ISalary {

    public Salary(AbsMediator _mediator) {
        super(_mediator);
    }

    @Override
    public void increaseSalary() {
        super.mediator.up(this);
    }

    @Override
    public void decreaseSalary() {
        super.mediator.down(this);
    }
}
