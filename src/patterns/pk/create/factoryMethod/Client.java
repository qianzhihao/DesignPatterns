package patterns.pk.create.factoryMethod;

public class Client {
    public static void main(String[] args) {
        ISuperMan adultSuperMan = SuperManFactory.createSuperMan("child");
        adultSuperMan.specialTalent();
    }
}
