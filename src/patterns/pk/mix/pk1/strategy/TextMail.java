package patterns.pk.mix.pk1.strategy;

public class TextMail extends MailTemplate {
    public TextMail(String _from, String _to, String _subject, String _context) {
        super(_from, _to, _subject, _context);
    }

    public String getContext() {
        String context = "\n    Content-Type: text/plain;charset=GB2312\n    " + super.getContext();
        context = context + "\n    Mail Format is : TXT";
        return context;
    }
}
