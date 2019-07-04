package patterns.mix.observerAndMediator;

public class Beggar extends EventCustomer {

    public Beggar() {
        super(EventCustomType.DEL);
    }

    @Override
    public void exec(ProductEvent event) {
        Product p = event.getSource();
        ProductEventType type = event.getEventType();
        System.out.println(p.getName() + type);
    }
}
