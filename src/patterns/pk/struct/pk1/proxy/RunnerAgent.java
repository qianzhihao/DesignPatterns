package patterns.pk.struct.pk1.proxy;

import java.util.Random;

public class RunnerAgent implements IRunner {
    private IRunner runner;
    public RunnerAgent(IRunner _runner) {
        this.runner = _runner;
    }

    public void run() {
        Random rand = new Random();

        if (rand.nextBoolean()) {
            System.out.println("代理人统一安排运动员跑步");
            runner.run();
        } else {
            System.out.println("代理人心情不好，不安排运动员跑步");
        }
    }
}
