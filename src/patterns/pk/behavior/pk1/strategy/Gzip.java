package patterns.pk.behavior.pk1.strategy;

public class Gzip implements Algorithm {
    @Override
    public boolean compress(String source, String to) {
        System.out.println(source + "-->" + to + "GZip Compress Success!");
        return true;
    }

    @Override
    public boolean uncompress(String source, String to) {
        System.out.println(source + "-->" + to + "GZip UnCompress Success!");
        return true;
    }
}
