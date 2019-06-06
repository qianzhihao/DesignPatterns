package patterns.Decorator.example;

public class Decorator extends SchoolReport {
    //首先我要知道是哪个成绩单
    private SchoolReport sr;
    //构造 函数， 传递 成绩单 过来
    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }
    //成绩单 还是 要被 看到 的
    public void report() {
        this.sr.report();
    }
    //看完 还是 要 签名 的
    public void sign(String name) {
        this.sr.sign(name);
    }
}
