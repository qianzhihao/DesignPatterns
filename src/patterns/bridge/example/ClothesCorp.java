package patterns.bridge.example;

public class ClothesCorp extends Corp {
    protected void produce() {
        System.out.println("服装公司生产衣服***");
    }

    protected void sell() {
        System.out.println("服装公司出售衣服***");
    }

    public void makeMoney() {
        super.makeMoney();
        System.out.println("服装公司赚小钱***");
    }
}
