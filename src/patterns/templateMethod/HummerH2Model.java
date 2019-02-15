package patterns.templateMethod;

public class HummerH2Model extends HummerModel {

    //发动
    @Override
    public void start() {
        System.out.println("悍马H2发动。。。");
    }

    //刹车
    @Override
    public void stop() {
        System.out.println("悍马H2制动。。。");
    }

    //喇叭
    @Override
    public void alarm() {
        System.out.println("悍马H2鸣笛。。。");
    }

    //引擎声
    @Override
    public void engineBoom() {
        System.out.println("悍马H2引擎声音。。。");
    }

}
