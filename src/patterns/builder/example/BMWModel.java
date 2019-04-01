package patterns.builder.example;

/**
 * 宝马 模型代码
 * @author qianzhihao
 * @date 20190401
 */
public class BMWModel extends CarModel {
    @Override
    protected void alarm() {
        System.out.println("宝马车的喇叭声音是这个样子的。。。");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马车的引擎声音是这个样子的。。。");
    }

    @Override
    protected void start() {
        System.out.println("宝马车跑起来是这个样子的。。。");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车制动是这个样子的。。。");
    }
}
