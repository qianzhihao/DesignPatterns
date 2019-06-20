package patterns.pk.struct.pk2.decorator;

public class Decorator implements Swan {

    private Swan swan;

    public Decorator(Swan _swan) {
        this.swan = _swan;
    }

    @Override
    public void fly() {
        swan.fly();
    }

    @Override
    public void cry() {
        swan.cry();
    }

    @Override
    public void desAppearance() {
        swan.desAppearance();
    }
}
