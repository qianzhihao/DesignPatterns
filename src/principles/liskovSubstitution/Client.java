package principles.liskovSubstitution;

public class Client {
    public static void main(String[] args) {
        /**
         * 士兵射击
         */
        Soldier sanMao = new Soldier();
        sanMao.setGun(new Handgun());
        sanMao.killEnemy();

        /**
         * 狙击手射击
         */
        Snipper siMao = new Snipper();
//        向下转型是不安全的，子类出现的地方父类未必就可以出现
//        siMao.setRifle((AUG)(new Rifle()));
        siMao.setRifle(new AUG());
        siMao.killEnemy();

    }
}
