package patterns.state.example;

public class Lift implements ILift {
    @Override
    public void open() {
        System.out.println("电梯门开启***");
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭***");
    }

    @Override
    public void run() {
        System.out.println("电梯上下运行***");
    }

    @Override
    public void stop() {
        System.out.println("电梯停止***");
    }
}
