package patterns.strategy.extend;

public class Add implements Calculator {
    public int exec(int a, int b) {
        return a + b;
    }
}
