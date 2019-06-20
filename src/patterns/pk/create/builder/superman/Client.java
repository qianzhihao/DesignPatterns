package patterns.pk.create.builder.superman;

public class Client {
    public static void main(String[] args) {
        SuperMan adultSuperMan = Director.getAdultSuperMan();
        System.out.println(adultSuperMan.getSpecialTalent());
    }
}
