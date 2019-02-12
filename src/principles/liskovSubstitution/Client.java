package principles.liskovSubstitution;

import java.util.HashMap;

public class Client {

    public static void invoker() {
        //父类存在的地方，子类就应该能够存在
        Son f = new Son();
        HashMap map = new HashMap();
        f.doSomething(map);
    }

    public static void main(String[] args) {

        invoker();

//        /**
//         * 士兵射击
//         */
//        Soldier sanMao = new Soldier();
//        sanMao.setGun(new Handgun());
//        sanMao.killEnemy();
//
//        /**
//         * 狙击手射击
//         */
//        Snipper siMao = new Snipper();
////        向下转型是不安全的，子类出现的地方父类未必就可以出现
////        siMao.setRifle((AUG)(new Rifle()));
//        siMao.setRifle(new AUG());
//        siMao.killEnemy();

    }
}
