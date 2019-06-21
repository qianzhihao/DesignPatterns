package patterns.pk.behavior.pk1.command;

public class GzipReceiver implements IReceiver {
    @Override
    public boolean compress(String source, String to) {
        System.out.println(source + "-->" + to + "\n GZip Compress Success!");
        return true;
    }

    @Override
    public boolean uncompress(String source, String to) {
        System.out.println(source + "-->" + to + "\n GZip UnCompress Success!");
        return true;
    }
}
