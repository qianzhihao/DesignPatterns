package patterns.pk.behavior.pk1.strategy;

public class Context {
    private Algorithm al;
    public Context(Algorithm _al) {
        this.al = _al;
    }

    public boolean compress(String source, String to) {
        return al.compress(source, to);
    }

    public boolean uncompress(String source, String to) {
        return al.uncompress(source, to);
    }
}
