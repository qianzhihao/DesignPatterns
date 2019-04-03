package patterns.proxy.define;

import net.sf.cglib.proxy.InvocationHandler;
import net.sf.cglib.proxy.Proxy;

public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h) {
        //
        if (true) {
            //
            (new BeforeAdvice()).exec();
        }
        //
        return (T) Proxy.newProxyInstance(loader, interfaces,h);
    }
}
