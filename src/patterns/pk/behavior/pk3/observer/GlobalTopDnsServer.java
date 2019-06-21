package patterns.pk.behavior.pk3.observer;

import patterns.pk.behavior.pk3.responsibilityChain.Recorder;

public class GlobalTopDnsServer extends DnsServer {
    @Override
    protected void sign(Recorder recorder) {
        recorder.setOwner("Global DNS server");
    }

    @Override
    protected boolean isLocal(Recorder recorder) {
        return true;
    }
}
