package patterns.pk.mix.pk1.strategy;

public class Client {
    public static void main(String[] args) {
        MailTemplate m = new HtmlMail("123@abc.com","456@efg.cn","789","1011121314");
        MailServer mail = new MailServer(m);
        mail.sendMail();
    }
}
