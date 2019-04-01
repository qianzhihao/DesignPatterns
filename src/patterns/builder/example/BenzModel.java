package patterns.builder.example;

/**
 * benz 模型代码
 * @author qianzhihao
 * @date 20190401
 */
public class BenzModel extends CarModel {
    @Override
    protected void alarm() {
        System.out.println("奔驰车的喇叭声音是这个样子的。。。");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰车的引擎声音是这个样子的。。。");
    }

    @Override
    protected void start() {
        System.out.println("奔驰车跑起来是这个样子的。。。");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰车制动是这个样子的。。。");
    }
}
