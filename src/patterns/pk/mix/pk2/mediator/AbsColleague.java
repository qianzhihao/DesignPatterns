package patterns.pk.mix.pk2.mediator;

public abstract class AbsColleague {
    protected AbsMediator mediator;
    public AbsColleague(AbsMediator _mediator) {
        this.mediator = _mediator;
    }
}
