package patterns.mix.observerAndMediator;

public class Commoner extends EventCustomer {
    public Commoner() {
        super(EventCustomType.NEW);
    }

    @Override
    public void exec(ProductEvent event) {
        Product p = event.getSource();
        ProductEventType type = event.getEventType();
        System.out.println(p.getName() + type);
    }
}
