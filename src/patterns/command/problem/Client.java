package patterns.command.problem;

/**
 * 场景类
 */
public class Client {
    public static void main(String[] args) {
        //首先客户找到需求组说，过来谈需求，并修改
        System.out.println("------客户要求增加一项需求------");
        Group rg = new RequirementGroup();
        rg.find();
        rg.add();
        rg.delete();
        rg.plan();
        //首先客户找到美工组说，过来谈页面，并修改
        System.out.println("------客户要求增加一个页面------");
        Group pg = new PageGroup();
        pg.find();
        pg.add();
        pg.delete();
        pg.plan();
        //首先客户找到代码组说，过来谈代码，并修改
        System.out.println("------客户要求增加一项功能------");
        Group cg = new CodeGroup();
        cg.find();
        cg.add();
        cg.delete();
        cg.plan();
    }
}
