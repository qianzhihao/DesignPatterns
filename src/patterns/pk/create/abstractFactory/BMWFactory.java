package patterns.pk.create.abstractFactory;

public class BMWFactory implements CarFactory {
    public ICar createSuv() {
        return new BMWSuv();
    }

    public ICar createVan() {
        return new BMWVan();
    }
}
