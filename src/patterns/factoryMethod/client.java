package patterns.factoryMethod;

public class client {
    public static void main(String[] args) {
        Creator creator = new ConcretecCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
        /*继续业务处理*/
    }
}
