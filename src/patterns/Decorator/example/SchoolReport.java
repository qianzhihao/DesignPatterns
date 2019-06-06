package patterns.Decorator.example;

public abstract class SchoolReport {
    //成绩单主要展示的就是你的成绩情况
    public abstract void report();
    //成绩单 要 家长 签字， 这个 是最 要命 的
    public abstract void sign(String name);
}
