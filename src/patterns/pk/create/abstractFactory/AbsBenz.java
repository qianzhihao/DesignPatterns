package patterns.pk.create.abstractFactory;

public abstract class AbsBenz implements ICar {
    private final static String BENZ_BAND = "奔驰汽车";
    public String getBand() {
        return BENZ_BAND;
    }

    public abstract String getModel();
}
