package patterns.pk.mix.pk1.bridge;

public class HtmlMail extends MailTemplate {
    public HtmlMail(String _from, String _to, String _subject, String _context) {
        super(_from, _to, _subject, _context);
    }

    @Override
    public String getContext() {
        String context =  "\n    Content-Type: multipart/mixed; charset=GB2312\n    " + super.getContext();
        context = context + "\n    Mail Format is : HTML";
        return context;
    }
}
