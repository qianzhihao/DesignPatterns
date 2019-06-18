package patterns.interpreter.define;

import java.util.Stack;

public class Client {
    public static void main(String[] args) {
        Context ctx = new Context();
        Stack<Expression> stack = null;
        for (;;) {

        }

        Expression exp = stack.pop();
        exp.interpreter(ctx);
    }
}
