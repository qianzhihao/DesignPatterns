package patterns.pk.struct.pk2.adapter;

public class UglyDuckling extends WhiteSwan implements Duck {

    public void desBehavior() {
        System.out.println("It can swim");
        super.fly();
    }

    public void cry() {
        super.cry();
    }

    public void desAppearance() {
        super.desAppearance();
    }
}
