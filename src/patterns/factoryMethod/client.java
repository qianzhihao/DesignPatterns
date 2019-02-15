package patterns.factoryMethod;

public class Client {
    public static void main(String[] args) {
//        Creator creator = new ConcreteCreator();
//        Product product = creator.createProduct(ConcreteProduct1.class);
//        /*继续业务处理*/

        //定义两个工厂
        AbstractCreator creator1 = new Creator1();
        AbstractCreator creator2 = new Creator2();

        //生产A1对象
        AbstractProductA a1 = creator1.createProductA();

        //生产A2对象
        AbstractProductA a2 = creator2.createProductA();

        //生产B1对象
        AbstractProductB b1 = creator1.createProductB();

        //生产B2对象
        AbstractProductB b2 = creator2.createProductB();

        /*
        * 然后在这里就可以为所欲为了...
        * */

    }
}
