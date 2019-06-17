package patterns.state.example;

public interface ILift {
    public void open();
    public void close();
    public void run();
    public void stop();
}
