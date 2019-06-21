package patterns.pk.behavior.pk3.responsibilityChain;

import java.util.Random;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.isLocal;

public abstract class DnsServer {
    private DnsServer upperServer;
    public final Recorder resolve(String domain) {
        Recorder recorder = null;
        if (isLocal(domain)) {
            recorder = echo(domain);
        } else {
            recorder = upperServer.resolve(domain);
        }
        return recorder;
    }

    public void setUpperServer(DnsServer _upperServer) {
        this.upperServer = _upperServer;
    }

    protected abstract boolean isLocal(String domain);

    protected Recorder echo(String domain) {
        Recorder recorder = new Recorder();
        recorder.setIp(genIpAddredd());
        recorder.setDomain(domain);
        return recorder;
    }

    private String genIpAddredd() {
        Random random = new Random();
        String address = random.nextInt(255) + "." +random.nextInt(255) + "." + random.nextInt(255) + "." + random.nextInt(255);
        return address;
    }
}
