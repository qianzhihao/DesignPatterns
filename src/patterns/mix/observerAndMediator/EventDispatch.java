package patterns.mix.observerAndMediator;

import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

public class EventDispatch implements Observer {
    private final static EventDispatch dispatch = new EventDispatch();

    private Vector<EventCustomer> customer = new Vector<EventCustomer>();

    private EventDispatch() {
    }

    public static EventDispatch getEventDispatch() {
        return dispatch;
    }

    public void update(Observable o, Object arg) {
        Product product = (Product)arg;
        ProductEvent event = (ProductEvent)o;
        for (EventCustomer e:customer
             ) {
            for (EventCustomType t:e.getCustomType()
                 ) {
                if (t.getValue() == event.getEventType().getValue()) {
                    e.exec(event);
                }
            }
        }
    }

    public void registerCustomer(EventCustomer _customer) {
        customer.add(_customer);
    }
}
