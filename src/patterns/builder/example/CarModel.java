package patterns.builder.example;

import java.util.ArrayList;
/**
 * 车的抽象类
 * @author qianzhihao
 * @date 20190401
 */
public abstract class CarModel {
    // 这个参数是各个基本方法执行的顺序
    private ArrayList<String> sequence = new ArrayList<String>();
    //模型是启动开始跑了
    protected abstract void start();
    //制动
    protected abstract void stop();
    //喇叭
    protected abstract void alarm();
    //引擎
    protected abstract void engineBoom();
    //跑
    final public void run() {
        // 循环一遍，谁在前，就先执行谁
        for (int i = 0; i < this.sequence.size(); i++) {
            String actionName = this.sequence.get(i);
            if (actionName.equalsIgnoreCase("start")) {
                this.start();
            } else if (actionName.equalsIgnoreCase("stop")) {
                this.stop();
            } else if (actionName.equalsIgnoreCase("alarm")) {
                this.alarm();
            } else if (actionName.equalsIgnoreCase("engine boom")) {
                this.engineBoom();
            }
        }
    }
    //把传递过来的值传递到类里
    final public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}
