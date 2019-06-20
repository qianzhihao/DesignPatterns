package patterns.pk.struct.pk2.decorator;

public class Client {
    public static void main(String[] args) {
        System.out.println("===Long time ago, there is a little ugly duck===");
        Swan duckLing = new UglyDuckling();
        duckLing.desAppearance();
        duckLing.cry();
        duckLing.fly();
        System.out.println("\n===one day, the little duck found it is a beautiful Swan===");
        duckLing = new BeautifyAppearance(duckLing);
        duckLing = new StrongBehavior(duckLing);
        duckLing.desAppearance();
        duckLing.cry();
        duckLing.fly();
    }
}
