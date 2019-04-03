package patterns.prototype.example;

/**
 * 广告信模板代码
 * @author qianzhihao
 * @date 20190403
 */
public class AdvTemplate {
    //广告信名称
    private String advSubject = "XX银行国庆信用卡抽奖活动";
    //广告信内容
    private String advContext = "国庆抽奖活动通知：只要刷卡就送代金券。。。";
    //获取广告信名称
    public String getAdvSubject() {
        return this.advSubject;
    }
    //获取广告信内容
    public String getAdvContext() {
        return this.advContext;
    }
}
