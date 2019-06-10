package patterns.strategy.define;

public class ConcreteStrategy1 implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("Strategy1 relate things");
    }
}
