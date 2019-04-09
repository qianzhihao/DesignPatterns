package patterns.command.define;

/**
 * 抽象的 Command 类
 */
public abstract class Command {
    //定义一个子类的全局共享变量
    protected final Receiver receiver;
    //实现类必须定义一个接收者
    public Command(Receiver _receiver) {
        this.receiver = _receiver;
    }
    public abstract void execute();
}
