package patterns.pk.mix.pk2.mediator;

public class Mediator extends AbsMediator {
    @Override
    public void up(ISalary _salary) {
        upSalary();
        upTax();
    }

    @Override
    public void up(IPosition _position) {
        upPosition();
        upSalary();
        upTax();
    }

    @Override
    public void up(ITax _tx) {
        upTax();
        downSalary();
    }

    @Override
    public void down(ISalary _salary) {

    }

    @Override
    public void down(IPosition _position) {

    }

    @Override
    public void down(ITax _tx) {

    }

    private void upSalary() {
        System.out.println("Salary Double-Double!");
    }

    private void upTax() {
        System.out.println("Tax raise, contribute to the Nation");
    }

    private void upPosition() {
        System.out.println("Upgrade one grade");
    }

    private void downSalary() {
        System.out.println("Salary Half-half!");
    }

    private void downTax() {
        System.out.println("Tax down, thanks to the Nation");
    }

    private void downPosition() {
        System.out.println("downgrade for one");
    }
}
