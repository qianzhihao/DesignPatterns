package patterns.state.example;

public class OpenningState extends LiftState {
    @Override
    public void open() {
        System.out.println("电梯门开启：***");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.closingState);
        super.context.getLiftState().close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
