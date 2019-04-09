package patterns.command.define;

/**
 * 具体的Command类
 */
public class ConcreteCommand1 extends Command {
//    //对哪个Receiver类进行命令处理
//    private Receiver receiver;
//    //构造函数传递接收者
//    public ConcreteCommand1(Receiver _receiver) {
//        this.receiver = _receiver;
//    }
    //声明自己的默认接收者
    public ConcreteCommand1() {
        super(new ConcreteReceiver1());
    }
    //设置新的接收者
    public ConcreteCommand1(Receiver _receiver) {
        super(_receiver);
    }
    //必须实现一个命令
    public void execute() {
        //业务处理
        super.receiver.doSomething();
    }
}
