package patterns.mix.factoryAndStrategy;

public enum StrategyMan {
    SteadyDeduction("com.cbf4life.common.SteadyDeduction"),
    FreeDeduction("com.cbf4life.common.FreeDeduction");
    String value = "";
    private StrategyMan(String _value) {
        this.value = _value;
    }

    public String getValue() {
        return this.value;
    }
}
