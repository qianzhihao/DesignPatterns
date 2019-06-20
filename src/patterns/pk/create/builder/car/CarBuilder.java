package patterns.pk.create.builder.car;

public abstract class CarBuilder {
    private ICar car;
    private Blueprint bp;
    public Car buildCar() {
        return new Car(buildEngine(), buildWheel());
    }

    public void receiveBlueprint(Blueprint _bp) {
        this.bp = _bp;
    }

    protected Blueprint getBuleprint() {
        return bp;
    }

    protected abstract String buildWheel();
    protected abstract String buildEngine();
}
