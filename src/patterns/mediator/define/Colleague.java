package patterns.mediator.define;

import javax.print.attribute.standard.Media;

/**
 * 抽象同事类
 */
public abstract class Colleague {
    protected Mediator mediator;
    public Colleague(Mediator _mediator) {
        this.mediator = _mediator;
    }
}
