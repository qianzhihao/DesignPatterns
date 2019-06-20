package patterns.pk.struct.pk2.decorator;

public class StrongBehavior extends Decorator {
    public StrongBehavior(Swan _swan) {
        super(_swan);
    }

    public void fly() {
        System.out.println("I can fly now!");
    }
}
