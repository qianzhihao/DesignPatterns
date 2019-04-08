package patterns.mediator.example;

/**
 * 采购管理
 */
public class Purchase extends AbstractColleague{
    public Purchase(AbstractMediator _mediator) {
        super(_mediator);
    }
    //采购 IBM 电脑
    public void buyIBMcomputer(int number) {
        super.mediator.execute("purchase.buy", number);
//        //访问库存
//        Stock stock = new Stock();
//        //访问销售
//        Sale sale = new Sale();
//        //电脑的销售情况
//        int saleStatus = sale.getSaleStatus();
//        if (saleStatus > 80) {//销售情况良好
//            System.out.println("采购 IBM 电脑：" + number + "台");
//            stock.increase(number);
//        } else {//销售情况不好
//            int buyNumber = number/2;//折半采购
//            System.out.println("采购 IBM 电脑：" + buyNumber + "台");
//        }
    }
    //不再采购 IBM 电脑
    public void refuseBuyIBM() {
        System.out.println("不再采购 IBM 电脑");
    }
}
