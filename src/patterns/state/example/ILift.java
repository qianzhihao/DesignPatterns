package patterns.state.example;

public interface ILift {
    final static int OPENING_STATE = 1;
    final static int CLOSING_STATE = 2;
    final static int RUNNING_STATE = 3;
    final static int STOPPING_STATE = 4;

    public void setState(int state);

    public void open();
    public void close();
    public void run();
    public void stop();
}
