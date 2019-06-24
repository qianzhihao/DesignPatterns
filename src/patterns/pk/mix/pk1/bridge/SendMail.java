package patterns.pk.mix.pk1.bridge;

public class SendMail extends MailServer {
    public SendMail(MailTemplate _m) {
        super(_m);
    }
    @Override
    public void sendMail() {
        super.m.Add("Received: (sendmail); 7 Nov 2009 04:14:44 +0100");
        super.sendMail();
    }
}
