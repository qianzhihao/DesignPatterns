package patterns.proxy.extend.normal;

import patterns.proxy.example.IGamePlayer;

public class GamePlayer implements IGamePlayer {

    private String name = "";

    public GamePlayer(IGamePlayer _gamePlayer, String _name) throws Exception {
        if (_gamePlayer == null) {
            throw new Exception("不能创建真实角色！");
        } else {
            this.name = _name;
        }
    }

    @Override
    public void login(String user, String password) {
        System.out.println("登陆名为" + user + "的用户" + this.name + "登陆成功！");
    }

    @Override
    public void killBoss() {

        System.out.println(this.name + "is killing Boss!");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + "又升了一级！");
    }
}
