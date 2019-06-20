package patterns.pk.struct.pk2.adapter;

public class Client {
    public static void main(String[] args) {
        System.out.println("===Mom have five kids,four of them are:===");
        Duck duck = new Duckling();
        duck.cry();
        duck.desAppearance();
        duck.desBehavior();
        System.out.println("\n===one special duck is :===");
        Duck uglyDuckling = new UglyDuckling();
        uglyDuckling.cry();
        uglyDuckling.desAppearance();
        uglyDuckling.desBehavior();
    }
}
