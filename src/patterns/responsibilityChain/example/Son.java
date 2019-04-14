package patterns.responsibilityChain.example;

/**
 * 儿子类
 * @author qianzhihao
 * @date 20190414
 */
public class Son extends Handler {
    //儿子只处理母亲的请求
    public Son() {
        super(Handler.SON_LEVEL_REQUEST);
    }

    protected void response(IWomen women) {
        System.out.println("母亲向儿子请示");
        System.out.println(women.getRequest());
        System.out.println("儿子的答复是：同意\n");
    }
//    //母亲向儿子请示
//
//    @Override
//    public void HandleMessage(IWomen women) {
//        System.out.println("母亲的请示是："+ women.getRequest());
//        System.out.println("儿子的答复是：同意");
//    }
}
