package patterns.pk.mix.pk2.mediator;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        IPosition position = new Position(mediator);
        ISalary salary = new Salary(mediator);
        ITax tax = new Tax(mediator);
        System.out.println("===Position Promote===");
        position.promote();
    }
}
