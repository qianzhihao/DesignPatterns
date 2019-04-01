package patterns.builder.define;

/**
 * 具体建造者
 * @author qianzhihao
 * @date 20190401
 */
public class ConcreteProduct extends Builder {
    private Product product = new Product();
    //设置产品零件
    public void setPart() {
        // 产品类内的逻辑处理
    }
    //组建一个产品
    public Product buildProduct() {
        return product;
    }
}
