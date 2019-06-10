package patterns.strategy.define;

public class Context {
    private Strategy strategy = null;
    public Context(Strategy _strategy) {
        this.strategy = _strategy;
    }
    public void doAnything() {
        this.strategy.doSomething();
    }
}
