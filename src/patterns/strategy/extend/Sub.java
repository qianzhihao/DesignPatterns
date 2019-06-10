package patterns.strategy.extend;

public class Sub implements Calculator {
    public int exec(int a, int b) {
        return a - b;
    }
}
