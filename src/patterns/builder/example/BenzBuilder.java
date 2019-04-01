package patterns.builder.example;

import java.util.ArrayList;

/**
 * 奔驰车组装者
 * @author qianzhihao
 * @date 20190401
 */
public class BenzBuilder extends CarBuilder {
    private BenzModel benzModel = new BenzModel();

    @Override
    public CarModel getCarModel() {
        return this.benzModel;
    }
    public void setSequence(ArrayList<String> sequence) {
        this.benzModel.setSequence(sequence);
    }
}
