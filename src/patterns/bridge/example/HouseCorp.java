package patterns.bridge.example;

public class HouseCorp extends Corp {
    protected void produce() {
        System.out.println("房地产公司盖房***");
    }

    protected void sell() {
        System.out.println("房地产公司卖房***");
    }

    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚大钱了***");
    }
}
