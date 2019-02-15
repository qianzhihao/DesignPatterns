package patterns.templateMethod;

public class HummerH1Model extends HummerModel {

    //发动
    @Override
    public void start() {
        System.out.println("悍马H1发动。。。");
    }

    //刹车
    @Override
    public void stop() {
        System.out.println("悍马H1制动。。。");
    }

    //喇叭
    @Override
    public void alarm() {
        System.out.println("悍马H1鸣笛。。。");
    }

    //引擎声
    @Override
    public void engineBoom() {
        System.out.println("悍马H1引擎声音。。。");
    }

}
