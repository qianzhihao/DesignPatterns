package patterns.pk.mix.pk2.mediator;

public class Tax extends AbsColleague implements ITax {

    public Tax(AbsMediator _mediator) {
        super(_mediator);
    }

    @Override
    public void raise() {
        super.mediator.up(this);
    }

    @Override
    public void drop() {
        super.mediator.down(this);
    }
}
