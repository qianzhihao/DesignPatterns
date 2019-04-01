package patterns.builder.example;

import java.util.ArrayList;
/**
 * 抽象汽车组装者
 * @author qianzhihao
 * @date 20190401
 */
public abstract class CarBuilder {
    public abstract void setSequence(ArrayList<String> sequence);
    public abstract CarModel getCarModel();
}
