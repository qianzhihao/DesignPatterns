package patterns.Flyweight.define;

public abstract class Flyweight {
    private String instrinsic;
    protected final String Extrinsic;
    public Flyweight(String _Extrinsic) {
        this.Extrinsic = _Extrinsic;
    }
    public abstract void operate();
    public String getInstrinsic() {
        return instrinsic;
    }
    public void setInstrinsic(String instrinsic) {
        this.instrinsic = instrinsic;
    }
}
