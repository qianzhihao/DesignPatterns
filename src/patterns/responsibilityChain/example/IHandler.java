package patterns.responsibilityChain.example;

/**
 * 有处理权的人员接口
 * @author qianzhihao
 * @date 20190414
 */
public interface IHandler {
    //一个 女性（ 女儿、 妻子 或者 母亲） 要求 逛街， 你要 处理 这个 请求
    public void HandleMessage(IWomen women);

}
