package patterns.observer.define;

import java.util.Vector;

public abstract class Subject {
    private Vector<Observer> observerVector = new Vector<Observer>();
    public void addObserver(Observer observer) {
        this.observerVector.add(observer);
    }
    public void delObserver(Observer observer) {
        this.observerVector.remove(observer);
    }
    public void notifyObservers() {
        for (Observer observer:this.observerVector
             ) {
            observer.update();
        }
    }
}
