package patterns.pk.behavior.pk1.command;

public interface IReceiver {
    public boolean compress(String source, String to);
    public boolean uncompress(String source, String to);
}
