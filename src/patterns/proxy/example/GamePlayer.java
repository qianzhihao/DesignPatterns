package patterns.proxy.example;

public class GamePlayer implements IGamePlayer {
    private String name = "";

    // 通过构造函数传递名称
    public GamePlayer(String _name) {
        this.name = _name;
    }

    //登陆
    @Override
    public void login(String user, String password) {
        System.out.println("登录名为"+ user+ "的用户"+ this.name + "登陆成功！");
    }

    //杀怪物
    @Override
    public void killBoss() {
        System.out.println(this.name + "在打怪物！");
    }

    //升级
    @Override
    public void upgrade() {
        System.out.println(this.name + "又升了一级！");
    }
}
