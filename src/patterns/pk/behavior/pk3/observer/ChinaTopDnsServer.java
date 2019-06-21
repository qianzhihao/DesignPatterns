package patterns.pk.behavior.pk3.observer;

import patterns.pk.behavior.pk3.responsibilityChain.Recorder;

public class ChinaTopDnsServer extends DnsServer {
    @Override
    protected void sign(Recorder recorder) {
        recorder.setOwner("China DNS server");
    }

    @Override
    protected boolean isLocal(Recorder recorder) {
        return recorder.getDomain().endsWith(".cn");
    }
}
