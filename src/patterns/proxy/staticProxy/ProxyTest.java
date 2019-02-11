package patterns.proxy.staticProxy;

/**
 * @author qianzhihao
 * @Description 测试类
 * @Date 2019/1/10
 */
public class ProxyTest {
    public static void main(String[] args) {
        BuyHouse buyHouse = new BuyHouseImpl();
        buyHouse.buyHouse();
        BuyHouseProxy buyHouseProxy = new BuyHouseProxy(buyHouse);
        buyHouseProxy.buyHouse();
    }
}
