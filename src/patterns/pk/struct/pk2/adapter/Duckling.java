package patterns.pk.struct.pk2.adapter;

public class Duckling implements Duck {
    @Override
    public void cry() {
        System.out.println("Ga~Ga~Ga~");
    }

    @Override
    public void desAppearance() {
        System.out.println("yellow and white cross, big long mouth");
    }

    @Override
    public void desBehavior() {
        System.out.println("it can swim");
    }
}
