package patterns.pk.behavior.pk3.observer;

import patterns.pk.behavior.pk3.responsibilityChain.Recorder;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;


public abstract class DnsServer extends Observable implements Observer {
    public void update(Observable arg0, Object arg1) {
        Recorder recorder = (Recorder)arg1;
        if (isLocal(recorder)) {
            recorder.setIp(genIpAddress());
        } else {
            responseFromUpperServer(recorder);
        }
        sign(recorder);
    }

    public void setUpperServer(DnsServer dnsServer) {
        super.deleteObservers();
        super.addObserver(dnsServer);
    }

    private void responseFromUpperServer(Recorder recorder) {
        super.setChanged();
        super.notifyObservers(recorder);
    }

    protected abstract void sign(Recorder recorder);

    protected abstract boolean isLocal(Recorder recorder);

    private String genIpAddress() {
        Random random = new Random();
        String address = random.nextInt(255) + "." + random.nextInt(255)
                + "." + random.nextInt(255) + "." + random.nextInt(255);
        return address;
    }

}
