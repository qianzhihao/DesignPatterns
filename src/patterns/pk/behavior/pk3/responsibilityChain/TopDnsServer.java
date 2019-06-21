package patterns.pk.behavior.pk3.responsibilityChain;

public class TopDnsServer extends DnsServer {
    @Override
    protected boolean isLocal(String domain) {
        return true;
    }

    @Override
    protected Recorder echo(String domain) {
        Recorder recorder = super.echo(domain);
        recorder.setOwner("Global TOP DNS Server");
        return recorder;
    }
}
