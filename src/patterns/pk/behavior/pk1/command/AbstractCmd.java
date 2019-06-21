package patterns.pk.behavior.pk1.command;

public abstract class AbstractCmd {

    protected IReceiver zip = new ZipReceiver();
    protected IReceiver gzip = new GzipReceiver();

    public abstract boolean execute(String source,String to);

}
