package patterns.pk.create.abstractFactory;

public class BenzSuv extends AbsBMW {
    private final static String G_SERIES = "G系列SUV";
    public String getModel() {
        return G_SERIES;
    }
}
