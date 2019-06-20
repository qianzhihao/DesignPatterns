package patterns.pk.struct.pk1.decorator;

import patterns.pk.struct.pk1.proxy.IRunner;
import patterns.pk.struct.pk1.proxy.Runner;

public class Client {
    public static void main(String[] args) {
        IRunner liu = new Runner();
        liu = new RunnerWithJet(liu);
        System.out.println("===增强后的运动员的功能===");
        liu.run();
    }
}
