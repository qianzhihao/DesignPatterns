package patterns.responsibilityChain.example;

public class Women implements IWomen {
    /* * 通过 一个 int 类型 的 参数 来 描述 妇女 的 个人 状况
    * 1-- 未 出嫁
    * 2-- 出嫁
    * 3-- 夫 死
    */
    private int type = 0;

    //妇女的请示
    private String request = "";

    //构造函数传递过来请求
    public Women(int _type,String _request) {
        this.type = _type;
        this.request = _request;
    }

    //获得自己的状况
    public int getType() {
        return this.type;
    }

    //获得妇女的请求
    public String getRequest() {
        return this.request;
    }
}
