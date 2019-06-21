package patterns.pk.behavior.pk2.abstractFactory;

public class Context {
    private WorkAlgorithm workMethod;
    public WorkAlgorithm getWork() {
        return workMethod;
    }

    public void setWork(WorkAlgorithm work) {
        this.workMethod = work;
    }

    public void work() {
        workMethod.work();
    }
}
