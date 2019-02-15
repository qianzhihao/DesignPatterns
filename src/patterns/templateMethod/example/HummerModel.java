package patterns.templateMethod.example;

public abstract class HummerModel {
    /*
    * 首先，这个模型要能够被发动起来，别管是手摇发动，还是电力发动，反正是要能够发动起来
    * 那这个实现要在实现类里了
    * */
    public abstract void start();

    //能发动，还要能刹车
    public abstract void stop();

    //喇叭会发出声音
    public abstract void alarm();

    //引擎会轰鸣
    public abstract void engineBoom();

    //模型会跑
    public void run() {

        //先发动汽车
        this.start();

        //引擎开始轰鸣
        this.engineBoom();

        //然后就开始跑了，跑的过程中按喇叭
        this.alarm();

        //制动
        this.stop();
    }
}
