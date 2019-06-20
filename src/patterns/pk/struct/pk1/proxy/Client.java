package patterns.pk.struct.pk1.proxy;

public class Client {
    public static void main(String[] args) {
        IRunner liu = new Runner();
        IRunner agent = new RunnerAgent(liu);
        System.out.println("===客人找到运动员的代理要求其去跑步===");
        agent.run();
    }
}
