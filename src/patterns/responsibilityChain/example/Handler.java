package patterns.responsibilityChain.example;

/**
 * 修改后的handler类
 * @author qianzhihao
 * @date 20190414
 */
public abstract class Handler {
    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBAND_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;
    //能处理的级别
    private int level = 0;
    //责任传递，下一个责任人是谁
    private Handler nextHandler;
    //每个类都要说明一下自己能处理哪些请求
    public Handler(int _level) {
        this.level = _level;
    }

    //一个女性要求出去逛街，你要处理这个请求
    public final void HandleMessage(IWomen women) {
        if (women.getType() == this.level) {
            this.response(women);
        } else {
            if (this.nextHandler != null) { //有后续环节，才能把请求往后送
                this.nextHandler.HandleMessage(women);
            } else { //没有后续处理人了，不用处理了
                System.out.println("没地方请示了，按不同意处理！");
            }
        }
    }

    /**
     * 如果不属于你处理的请求，你应该让她找下一个环节处理人
     * @param handler
     */
    public void setNext(Handler _handler) {
        this.nextHandler = _handler;
    }

    protected abstract void response(IWomen women);
}
