package patterns.templateMethod.expand;

public class HummerH1Model extends HummerModel {

    private boolean alarmFlag = true; //要响喇叭
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

    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    //要不要响喇叭，是由客户来决定的
    public void setAlarm(boolean isAlarm) {
        this.alarmFlag = isAlarm;
    }

}
