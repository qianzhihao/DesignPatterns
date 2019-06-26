package patterns.pk.wrapping.bridge;

public class Singer extends AbsStar {

    public Singer() {
        super(new Sing());
    }

    public Singer(AbsAction _action) {
        super(_action);
    }

    public void doJob() {
        System.out.println("\n===Singer star's work===");
        super.doJob();
    }
}
