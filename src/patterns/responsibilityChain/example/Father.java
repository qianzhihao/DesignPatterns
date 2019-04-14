package patterns.responsibilityChain.example;

/**
 * 父亲类
 * @author qianzhihao
 * @date 20190414
 */
public class Father extends Handler {
    //父亲只处理女儿的请求
    public Father() {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    protected void response(IWomen women) {
        System.out.println("女儿向父亲请示");
        System.out.println(women.getRequest());
        System.out.println("父亲的答复是：同意\n");
    }
//    //未出嫁女儿来请示父亲
//
//    @Override
//    public void HandleMessage(IWomen women) {
//        System.out.println("女儿的请示是："+ women.getRequest());
//        System.out.println("父亲的答复是：同意");
//    }
}
