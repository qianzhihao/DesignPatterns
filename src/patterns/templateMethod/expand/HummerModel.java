package patterns.templateMethod.expand;

public abstract class HummerModel {
    /**
     * 首先，这个模型要能够发动起来，别管是手摇发动，
     * 还是电力发动，反正是要能够发动起来，这个实现
     * 要在实现类里了
     */

    protected abstract void start();

    //能发动，还要能刹车
    protected abstract void stop();

    //喇叭会发出声音
    protected abstract void alarm();

    //引擎会轰鸣
    protected abstract void engineBoom();

    //模型会跑
    final public void run() {
        //先发动汽车
        this.start();
        //引擎开始轰鸣
        this.engineBoom();
        //控制喇叭
        if (this.isAlarm()) {
            this.alarm();
        }
        //到达目的地就停车
        this.stop();
    }

    //钩子方法，默认喇叭是会响的
    protected boolean isAlarm() {
        return true;
    }

}
