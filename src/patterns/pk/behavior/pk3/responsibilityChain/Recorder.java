package patterns.pk.behavior.pk3.responsibilityChain;

public class Recorder {
    private String domain;
    private String ip;
    private String owner;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        String str = "Domain: " + this.domain;
        str = str + "\nIP Address:" + this.ip;
        str = str + "\nOwner:" + this.owner;
        return str;
    }
}
