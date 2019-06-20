package patterns.pk.struct.pk2.decorator;

public class BeautifyAppearance extends Decorator {
    public BeautifyAppearance(Swan _swan) {
        super(_swan);
    }

    @Override
    public void desAppearance() {
        System.out.println("pure white appearance, very lovely!");
    }
}
