package patterns.templateMethod.expand;

public class HummerH2Model extends HummerModel {

    //发动
    protected void start() {
        System.out.println("悍马H1发动。。。");
    }

    //刹车
    protected void stop() {
        System.out.println("悍马H1制动。。。");
    }

    //喇叭
    protected void alarm() {
        System.out.println("悍马H1鸣笛。。。");
    }

    //引擎声
    protected void engineBoom() {
        System.out.println("悍马H1引擎声音。。。");
    }

    //默认是没有喇叭的
    protected boolean isAlarm() {
        return false;
    }

}
