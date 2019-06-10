package patterns.decorator.example;

public class FouthGradeSchoolReport extends SchoolReport {
    //我的 成绩单
    public void report() {
        //成绩单 的 格式 是 这个 样子 的
        System.out.println("尊敬的XXX家长：");
        System.out.println("    ......");
        System.out.println("    语文 62  数学 65  体育 98  自然 63");
        System.out.println("    ......");
        System.out.println("                      家长签名：      ");
    }

    //家长签名
    public void sign(String name) {
        System.out.println("家长签名为：" + name);
    }
}
