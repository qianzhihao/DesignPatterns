package patterns.proxy.define;

/**
 * 通知实现类
 * @author qianzhihao
 * @date 20190403
 */
public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("我是前置通知，我被执行了");
    }
}
