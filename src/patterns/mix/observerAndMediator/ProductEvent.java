package patterns.mix.observerAndMediator;

import java.util.Observable;

public class ProductEvent extends Observable {
    private Product source;
    private ProductEventType type;
    public ProductEvent(Product p) {
        this(p, ProductEventType.NEW_PRODUCT);
    }
    public ProductEvent(Product p, ProductEventType _type) {
        this.source = p;
        this.type = _type;
        notifyEventDispatch();
    }

    public Product getSource() {
        return source;
    }

    public ProductEventType getEventType() {
        return this.type;
    }

    private void notifyEventDispatch() {
//        super.addOverver(EventDispatch.getEventDispatch());
        super.setChanged();
        super.notifyObservers(source);
    }
}
