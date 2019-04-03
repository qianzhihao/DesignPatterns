package patterns.proxy.extend.force;

import java.util.Date;

public class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("zhangsan");
//        IGamePlayer proxy = player.getProxy();
        System.out.println("start time is :" + new Date());
        player.login("zhangsan","password");
        player.killBoss();
        player.upgrade();
        System.out.println("end time is :" + new Date());
    }
}
