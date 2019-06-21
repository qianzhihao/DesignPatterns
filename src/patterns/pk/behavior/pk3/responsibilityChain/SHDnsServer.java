package patterns.pk.behavior.pk3.responsibilityChain;

public class SHDnsServer extends DnsServer {
    @Override
    protected boolean isLocal(String domain) {
        return domain.endsWith(".sh.cn");
    }

    @Override
    protected Recorder echo(String domain) {
        Recorder recorder = super.echo(domain);
        recorder.setOwner("Shanghai DNS Server");
        return recorder;
    }
}
