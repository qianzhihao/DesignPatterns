package patterns.responsibilityChain.example;

/**
 * 丈夫类
 * @author qianzhihao
 * @date 20190414
 */
public class Husband extends Handler {
    //丈夫只处理妻子的请求
    public Husband() {
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }

    protected void response(IWomen women) {
        System.out.println("妻子向丈夫请示");
        System.out.println(women.getRequest());
        System.out.println("丈夫的答复是：同意\n");
    }
//    //妻子向丈夫请示
//
//    @Override
//    public void HandleMessage(IWomen women) {
//        System.out.println("妻子的请示是："+ women.getRequest());
//        System.out.println("丈夫的答复是：同意");
//    }
}
