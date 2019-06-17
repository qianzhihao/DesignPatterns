package patterns.state.example;

public class Client {
    public static void main(String[] args) {
        ILift lift = new Lift();
        lift.setState(ILift.STOPPING_STATE);
        lift.open();
        lift.close();
        lift.run();
        lift.stop();
        lift.open();
        lift.close();
    }
}
