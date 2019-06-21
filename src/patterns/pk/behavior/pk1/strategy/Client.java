package patterns.pk.behavior.pk1.strategy;

public class Client {
    public static void main(String[] args) {
        Context context;
        System.out.println("===执行算法===");
        context = new Context(new Zip());
        context.compress("d:\\testForZip.txt", "d:\\testForZip.zip");
        context.compress("d:\\testForZip.zip", "e:\\testForZip.txt");
    }
}
