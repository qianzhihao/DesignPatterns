package patterns.observer.define;

public class ConcreteSubject extends Subject {
    public void doSomething() {
        super.notifyObservers();
    }
}
