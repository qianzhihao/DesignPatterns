package patterns.pk.struct.pk2.decorator;

public class UglyDuckling implements Swan {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

    @Override
    public void cry() {
        System.out.println("kloo~kloo~");
    }

    @Override
    public void desAppearance() {
        System.out.println("dirty white, big head");
    }
}
