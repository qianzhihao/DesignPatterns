package patterns.mix.observerAndMediator;

public class Client {
    public static void main(String[] args) {
        EventDispatch dispatch = EventDispatch.getEventDispatch();
        dispatch.registerCustomer(new Beggar());
        dispatch.registerCustomer(new Commoner());
        dispatch.registerCustomer(new Nobleman());

        ProductManager factory = new ProductManager();
        System.out.println("===Sim Event===");
        System.out.println("===Create a boy Boom===");
        Product p =  factory.createProduct("boy boom");
        System.out.println("===Modify name of the boom===");
        System.out.println("===Modify name to fat===");
        factory.editProduct(p,"fat boom");

        System.out.println("\n===Sim Clone Event===");
        System.out.println("===Clone fat boom===");
        factory.clone(p);

        System.out.println("\n===destory Event===");
        System.out.println("abandon fat boom");
        factory.abandonProduct(p);
    }
}
