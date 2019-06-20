package patterns.pk.create.abstractFactory;

public class BMWVan extends AbsBMW {
    private final static String SEVENT_SERIES = "7系列车型商务车";
    public String getModel() {
        return SEVENT_SERIES;
    }
}
