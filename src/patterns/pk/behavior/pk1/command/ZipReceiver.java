package patterns.pk.behavior.pk1.command;

public class ZipReceiver implements IReceiver {
    @Override
    public boolean compress(String source, String to) {
        System.out.println(source + "-->" + to + "\n Zip Compress Success!");
        return true;
    }

    @Override
    public boolean uncompress(String source, String to) {
        System.out.println(source + "-->" + to + "\n Zip UnCompress Success!");
        return true;
    }
}
