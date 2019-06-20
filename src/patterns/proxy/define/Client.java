//package patterns.proxy.define;
//
//import net.sf.cglib.proxy.InvocationHandler;
//
///**
// * 动态代理的场景类
// * @author qianzhihao
// * @date 20190403
// */
//public class Client {
//    public static void main(String[] args) {
//        //定义一个主题
//        Subject subject = new RealSubject();
//        //定义一个handler
//        InvocationHandler handler = new MyInvocationHandler(subject);
//        //定义主题的代理
//        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),subject.getClass().getInterfaces(),handler);
//        //代理的行为
//        proxy.request();
//    }
//}
