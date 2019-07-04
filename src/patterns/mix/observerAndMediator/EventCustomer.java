package patterns.mix.observerAndMediator;

import java.util.Vector;

public abstract class EventCustomer {
    private Vector<EventCustomType> customType = new Vector<EventCustomType>();
    public EventCustomer(EventCustomType _type) {
        addCustomerType(_type);
    }

    public void addCustomerType(EventCustomType _type) {
        customType.add(_type);
    }

    public Vector<EventCustomType> getCustomType() {
        return customType;
    }

    public abstract void exec(ProductEvent event);
}
