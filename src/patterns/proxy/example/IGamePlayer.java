package patterns.proxy.example;

/**
 * 游戏者接口
 * @author qianzhihao
 * @date 20190402
 */
public interface IGamePlayer {
    //登陆游戏
    public void login(String user, String password);
    //杀怪物
    public void killBoss();
    //升级
    public void upgrade();
}
