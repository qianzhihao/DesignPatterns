package patterns.pk.create.builder.car;

public class Car implements ICar {
    private String engine;
    private String wheel;
    public Car(String _engine, String _wheel) {
        this.engine = _engine;
        this.wheel = _wheel;
    }

    public String getEngine() {
        return engine;
    }

    public String getWheel() {
        return wheel;
    }

    public String toString() {
        return "车的轮子是：" + wheel + "\n车的引擎是：" + engine;
    }
}
