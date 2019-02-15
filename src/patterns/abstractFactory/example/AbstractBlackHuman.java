package patterns.abstractFactory.example;

import patterns.factoryMethod.example.Human;

public abstract class AbstractBlackHuman implements Human{
    //黑色人种的肤色是黑色的
    public void getColor() {
        System.out.println("黑色人种的肤色是黑色的！");
    }
    //黑色人种讲话
    public void talk() {
        System.out.println("黑色人种会说话，一般人听不懂！");
    }
}
