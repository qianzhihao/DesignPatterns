package patterns.visitor.define;

public abstract class Element {
    public abstract void doSomething();
    public abstract void accept(IVisitor visitor);
}
