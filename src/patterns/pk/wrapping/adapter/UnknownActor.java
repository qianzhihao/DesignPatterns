package patterns.pk.wrapping.adapter;

public class UnknownActor implements IActor {
    @Override
    public void playact(String context) {
        System.out.println("Normal actor: " +context);
    }
}
