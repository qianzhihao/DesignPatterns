package patterns.mix.observerAndMediator;

public class Nobleman extends EventCustomer {
    public Nobleman() {
        super(EventCustomType.CLONE);
    }

    @Override
    public void exec(ProductEvent event) {
        Product p = event.getSource();
        ProductEventType type = event.getEventType();
        System.out.println(p.getName() + type);
    }
}
