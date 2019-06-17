package patterns.state.define;

public abstract class State {
    protected Context context;
    public void setContext(Context _context) {
        this.context = _context;
    }

    public abstract void handle1();
    public abstract void handle2();
}
