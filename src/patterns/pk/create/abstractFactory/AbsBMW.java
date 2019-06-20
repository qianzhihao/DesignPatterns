package patterns.pk.create.abstractFactory;

public abstract class AbsBMW implements ICar {
    private final static String BMW_BAND = "宝马汽车";
    public String getBand() {
        return BMW_BAND;
    }

    public abstract String getModel();
}
