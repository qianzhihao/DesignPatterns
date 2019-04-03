package patterns.proxy.define;

public class Proxy implements Subject {
    private Subject subject = null;

    public Proxy() {
        this.subject = new Proxy();
    }
    public Proxy(Object...objects) {

    }
    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    public void before() {

    }

    public void after() {

    }
}
