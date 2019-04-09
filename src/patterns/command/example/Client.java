package patterns.command.example;

/**
 * //增加一项需求
 * 删除一个页面
 */
public class Client {
    public static void main(String[] args) {
//        //定义我们的接头人
//        Invoker xiaoSan = new Invoker();
//        //客户要求增加一项需求
//        System.out.println("------客户要求增加一项需求------");
//        //客户下达命令
//        Command command = new AddRequirementCommand();
//        //接头人接手到命令
//        xiaoSan.setCommand(command);
//        //接头人执行命令
//        xiaoSan.action();
        //定义我们的接头人
        Invoker xiaoSan = new Invoker();
        //客户要求增加一项需求
        System.out.println("------客户要求删除一个页面------");
        //客户下达命令
        Command command = new DeletePageCommand();
        //接头人接手到命令
        xiaoSan.setCommand(command);
        //接头人执行命令
        xiaoSan.action();
    }
}
