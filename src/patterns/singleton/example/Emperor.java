package patterns.singleton.example;

import java.util.ArrayList;
import java.util.Random;

public class Emperor {

    private static int maxNumOfEmperor = 2;

    private static ArrayList<String> nameList = new ArrayList<String>();

    private static ArrayList<Emperor> emperorList = new ArrayList<Emperor>();

    private static int countNumOfEmperor = 0;

    static {
        for (int i = 0; i < maxNumOfEmperor; i++) {
            emperorList.add(new Emperor("皇" + (i+1) + "帝"));
        }
    }

//    //初始化一个皇帝
//    private static final Emperor emperor = new Emperor();
    private Emperor() {
        //世俗和道德约束，目的是不希望产生第二个皇帝
    }
    private Emperor(String name) {
        nameList.add(name);
    }
    public static Emperor getInstance() {
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return emperorList.get(countNumOfEmperor);
    }
    public static void say() {
        System.out.println(nameList.get(countNumOfEmperor));
    }
}
