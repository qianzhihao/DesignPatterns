package patterns.builder.example;

import java.util.ArrayList;

/**
 * 宝马车组装者
 * @author qianzhihao
 * @date 20190401
 */
public class BMWBuilder extends CarBuilder {
    private BMWModel bmw = new BMWModel();
    public CarModel getCarModel() {
        return this.bmw;
    }
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }
}
