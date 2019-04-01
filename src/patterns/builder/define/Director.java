package patterns.builder.define;

/**
 * 导演类
 * @author qianzhihao
 * @date 20190401
 * 导演类可以起到封装的作用，避免高层模块深入到建造者内部的实现类。
 * 当建造者模式比较庞大时，导演类可以有多个。
 */
public class Director {
    private Builder builder = new ConcreteProduct();
    public Product getAProduct() {
        builder.setPart();
        return builder.buildProduct();
    }
}
