//package patterns.proxy.cglib;
//
//import patterns.proxy.staticProxy.BuyHouse;
//import patterns.proxy.staticProxy.BuyHouseImpl;
//
///**
// * @author qianzhihao
// * @description CGLIB测试类
// * @date 20190110
// */
//public class CglibProxyTest {
//    public static void main(String[] args) {
//        BuyHouse buyHouse = new BuyHouseImpl();
//        CglibProxy cglibProxy = new CglibProxy();
//        BuyHouseImpl buyHouseCglibProxy = (BuyHouseImpl)cglibProxy.getInstance(buyHouse);
//        buyHouseCglibProxy.buyHouse();
//    }
//}
