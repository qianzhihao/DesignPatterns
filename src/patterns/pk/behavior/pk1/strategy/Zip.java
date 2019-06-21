package patterns.pk.behavior.pk1.strategy;

public class Zip implements Algorithm {
    @Override
    public boolean compress(String source, String to) {
        System.out.println(source + "-->" + to + "Zip Compress Success!");
        return true;
    }

    @Override
    public boolean uncompress(String source, String to) {
        System.out.println(source + "-->" + to + "Zip UnCompress Success!");
        return true;
    }
}
