package patterns.proxy.example;

import java.util.Date;

public class Client {
    public static void main(String[] args) {
        //定义一个痴迷的玩家
        IGamePlayer player = new GamePlayer("张三");
        IGamePlayer proxy = new GamePlayerProxy(player);
        //开始打游戏，记下当前时间
        System.out.println("开始时间是："+ new Date());
        proxy.login("zhangSan","password");
        //开始杀怪
        proxy.killBoss();
        // 升级
        proxy.upgrade();
        // 记录结束游戏时间
        System.out.println("结束时间是：" + new Date());
    }
}
