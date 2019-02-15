package patterns.factoryMethod;

public class client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
        /*继续业务处理*/
    }
}
