package patterns.mix.mvc;

public abstract class AbstractInterceptor {
    private ValueStack valueStack = ValueStackHelper.getValueStack();
    private int type = 0;
    protected ValueStack getValueStack() {
        return valueStack;
    }

    public final void exec() {

    }

    protected abstract void setType(int type);

    protected abstract void intercept();
}
