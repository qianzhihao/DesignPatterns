package patterns.pk.mix.pk2.mediator;

public class Position extends AbsColleague implements IPosition {
    @Override
    public void promote() {
        super.mediator.up(this);
    }

    @Override
    public void demote() {
        super.mediator.down(this);
    }

    public Position(AbsMediator _mediator) {
        super(_mediator);
    }
}
