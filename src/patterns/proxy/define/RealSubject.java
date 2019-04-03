package patterns.proxy.define;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("do something!");
    }
}
