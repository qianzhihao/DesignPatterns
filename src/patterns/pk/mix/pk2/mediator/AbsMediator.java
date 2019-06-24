package patterns.pk.mix.pk2.mediator;

public abstract class AbsMediator {
    protected final ISalary salary;
    protected final IPosition position;
    protected final ITax tax;

    public AbsMediator() {
        salary = new Salary(this);
        position = new Position(this);
        tax = new Tax(this);
    }

    public abstract void up(ISalary _salary);
    public abstract void up(IPosition _position);
    public abstract void up(ITax _tx);
    public abstract void down(ISalary _salary);
    public abstract void down(IPosition _position);
    public abstract void down(ITax _tx);
}
