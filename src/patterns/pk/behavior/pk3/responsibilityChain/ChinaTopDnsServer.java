package patterns.pk.behavior.pk3.responsibilityChain;

public class ChinaTopDnsServer extends DnsServer {
    @Override
    protected boolean isLocal(String domain) {
        return domain.endsWith(".cn");
    }

    @Override
    protected Recorder echo(String domain) {
        Recorder recorder = super.echo(domain);
        recorder.setOwner("China TOP DNS Server");
        return recorder;
    }
}
