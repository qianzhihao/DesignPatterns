package patterns.proxy.extend.dynamic;

import net.sf.cglib.proxy.InvocationHandler;
import net.sf.cglib.proxy.Proxy;
import patterns.proxy.extend.force.GamePlayer;
import patterns.proxy.extend.force.IGamePlayer;

import java.util.Date;

/**
 * 动态代理的场景类
 * @author qianzhihao
 * @date 20190403
 */
public class Client {
    public static void main(String[] args) throws Throwable{
        //定义一个痴迷的玩家
        IGamePlayer player = new GamePlayer("zhangsan");
        //定义一个handler
        InvocationHandler handler = new GamePlayIH(player);
        //开始打游戏，记录时间戳
        System.out.println("start time is:" + new Date());
        //获得类的class loader
        ClassLoader cl = player.getClass().getClassLoader();
        //动态产生一个代理者
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[]{IGamePlayer.class},handler);

        //登陆
        proxy.login("zhangsan","password");
        //开始杀怪
        proxy.killBoss();
        //升级
        proxy.upgrade();
        //记录结束游戏时间
        System.out.println("end time is:" + new Date());
    }
}
