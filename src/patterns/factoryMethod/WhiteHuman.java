package patterns.factoryMethod;

public class WhiteHuman implements Human {
    public void getColor() {
        System.out.println("白色人种的皮肤颜色是白色的！");
    }

    public void talk() {
        System.out.println("白色人种会说话，一般人说的是单字节。");
    }

    @Override
    public void getSex() {

    }
}
