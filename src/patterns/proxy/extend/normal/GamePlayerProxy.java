package patterns.proxy.extend.normal;

import patterns.proxy.example.IGamePlayer;

public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;
    public GamePlayerProxy(String name) {
        try {
            gamePlayer = new GamePlayer(this, name);
        } catch (Exception e) {

        }
    }

    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user,password);
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }
}
