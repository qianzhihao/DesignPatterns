package patterns.abstractFactory.example;

public abstract class AbstractYellowHuman implements Human{
    //黄色人种的肤色是黄色的
    public void getColor() {
        System.out.println("黄色人种的肤色是黄色的！");
    }
    //黄色人种讲话
    public void talk() {
        System.out.println("黄色人种会说话，一般说的是双字节！");
    }
}
