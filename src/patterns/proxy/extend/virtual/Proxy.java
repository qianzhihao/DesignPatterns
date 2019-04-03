package patterns.proxy.extend.virtual;

import patterns.proxy.define.RealSubject;
import patterns.proxy.define.Subject;

/**
 * 虚拟代理类
 */
public class Proxy implements Subject {
    //要代理哪个实现类
    private Subject subject;
    //实现接口中定义的方法
    public void request() {
        //判断一下真实主题是否初始化
        if (subject == null) {
            subject = new RealSubject();
        }
        subject.request();
    }
}
