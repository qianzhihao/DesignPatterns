package patterns.pk.create.abstractFactory;

public interface CarFactory {
    public ICar createSuv();

    public ICar createVan();
}
