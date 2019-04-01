package patterns.builder.example;

import java.util.ArrayList;

/**
 * 测试类
 * @author qianzhihao
 * @date 20190401
 */
public class Client {
    public static void main(String[] args) {
//        BenzModel benzModel = new BenzModel();
//        ArrayList<String> sequence = new ArrayList<>();
//        sequence.add("engine boom");
//        sequence.add("start");
//        sequence.add("stop");
//        benzModel.setSequence(sequence);
//        benzModel.run();

//        ArrayList<String> sequence =  new ArrayList<>();
//        sequence.add("engine boom");
//        sequence.add("start");
//        sequence.add("stop");
//        BenzBuilder benzBuilder = new BenzBuilder();
//        benzBuilder.setSequence(sequence);
//        BenzModel benzModel = (BenzModel)benzBuilder.getCarModel();
//        benzModel.run();

        Director director = new Director();
        for (int i = 0; i < 10000; i++) {
            director.getABenzModel().run();
        }
        for (int i = 0; i < 1000000; i++) {
            director.getBBenzModel().run();
        }
        for (int i = 0; i < 10000000; i++) {
            director.getCBMWModel().run();
        }

    }
}
