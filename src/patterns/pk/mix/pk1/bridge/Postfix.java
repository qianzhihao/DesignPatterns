package patterns.pk.mix.pk1.bridge;

public class Postfix extends MailServer {
    public Postfix(MailTemplate _m) {
        super(_m);
    }
    public void sendMail() {
        String context = "Received: from XXXX (Unknown [xxx.xxx.xxx.xxx]) by aaa.aaa.com (Postfix) with ESMTP id 8 DBCD172B8\n    ";
        super.m.Add(context);
        super.sendMail();
    }
}
