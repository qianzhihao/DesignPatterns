package patterns.pk.mix.pk1.bridge;

public abstract class MailServer {
    protected final MailTemplate m;
    public MailServer(MailTemplate _m) {
        this.m = _m;
    }

    public void sendMail() {
        System.out.println("===Mail Sending Infomation===");
        System.out.println("Sender:" + m.getFrom());
        System.out.println("Receiver:" + m.getTo());
        System.out.println("Subject:" + m.getSubject());
        System.out.println("Context:" + m.getContext());
    }
}
