package patterns.pk.struct.pk1.decorator;

import patterns.pk.struct.pk1.proxy.IRunner;

public class RunnerWithJet implements IRunner {
    private IRunner runner;

    public RunnerWithJet(IRunner _runner) {
        this.runner = _runner;
    }

    @Override
    public void run() {
        System.out.println("加快运动员的速度：为运动员增加喷气装置");
        runner.run();
    }
}
