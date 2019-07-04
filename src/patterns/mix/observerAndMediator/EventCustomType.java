package patterns.mix.observerAndMediator;

import patterns.mix.commandAndResponsibilityChain.DF_G;

public enum EventCustomType {
    NEW(1),
    DEL(2),
    EDIT(3),
    CLONE(4);
    private int value = 0;
    private EventCustomType(int _value) {
        this.value = _value;
    }
    public int getValue() {
        return value;
    }
}
