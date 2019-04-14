package patterns.responsibilityChain.example;

import java.util.ArrayList;
import java.util.Random;

/**
 * 场景类
 * @author qianzhihao
 * @date 20190414
 */
public class Client {
    public static void main(String[] args) {
        //随便挑选几个女性
        Random random = new Random();
        ArrayList<IWomen> womenArrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            womenArrayList.add(new Women(random.nextInt(4),"我要出去逛街"));
        }
        //定义三个请示对象
        Father father = new Father();
        Husband husband = new Husband();
        Son son = new Son();
        for (IWomen women:womenArrayList
             ) {
            if (women.getType() == 1) {//未结婚少女，请示父亲
                System.out.println("女儿向父亲请示------");
                father.HandleMessage(women);
            } else if (women.getType() == 2) {//已婚妇女，请示丈夫
                System.out.println("妻子向丈夫请示------");
                husband.HandleMessage(women);
            } else if (women.getType() == 3) {//母亲请示儿子
                System.out.println("母亲请示儿子------");
                son.HandleMessage(women);
            } else {
                //do nothing
            }
        }
    }
}
