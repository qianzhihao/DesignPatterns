package patterns.pk.create.builder.car;

public class BenzBuilder extends CarBuilder {
    @Override
    protected String buildWheel() {
        return super.getBuleprint().getWheel();
    }

    @Override
    protected String buildEngine() {
        return super.getBuleprint().getEngine();
    }
}
