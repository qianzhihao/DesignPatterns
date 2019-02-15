package patterns.factoryMethod;

public class YellowHuman implements Human {
    public void getColor() {
        System.out.println("黄色人种的皮肤颜色是黄色的！");
    }

    public void talk() {
        System.out.println("黄色人种会说话，一般人说的是双字节。");
    }

    @Override
    public void getSex() {

    }
}
