package patterns.proxy.extend.normal;

import patterns.proxy.example.IGamePlayer;

import java.util.Date;

public class Client {
    public static void main(String[] args) {
        IGamePlayer proxy = new GamePlayerProxy("zhangsan");
        System.out.println("start time is :"+ new Date());
        proxy.login("zhangsan","password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("end time is :" + new Date());
    }
}
