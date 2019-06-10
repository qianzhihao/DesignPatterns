package patterns.decorator.example;

public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport {
    //首先 要 定义 你要 美化 的 方法， 先给 老爸 说 学校 最高 成绩
    private void reportHighScore() {
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }
    //在 老爸 看 完毕 成绩单 后， 我 再 汇报 学校 的 排名 情况
    private void reportSort() {
        System.out.println("我是排名第38名...");
    }
    //由于 汇报 的 内容 已经 发生 变更， 那 所以 要 重写 父 类
    @Override
    public void report() {
        // 先说最高成绩
        this.reportHighScore();
        //然后老爸看成绩单
        super.report();
        // 然后告诉老爸学校排名
        this.reportSort();
    }
}
