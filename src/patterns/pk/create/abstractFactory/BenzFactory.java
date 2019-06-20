package patterns.pk.create.abstractFactory;

public class BenzFactory implements CarFactory {
    public ICar createSuv() {
        return new BenzSuv();
    }

    public ICar createVan() {
        return new BenzVan();
    }
}
