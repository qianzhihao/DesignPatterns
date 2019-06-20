package patterns.pk.create.abstractFactory;

public class Client {
    public static void main(String[] args) {
        System.out.println("===要求生产一辆奔驰SUV===");
        System.out.println("A、找到奔驰车工厂");
        CarFactory carFactory = new BenzFactory();
        System.out.println("B、开始生产奔驰SUV");
        ICar benzSuv = carFactory.createSuv();
        System.out.println("C、生产出的汽车如下：");
        System.out.println("汽车品牌："+ benzSuv.getBand());
        System.out.println("汽车型号："+ benzSuv.getModel());

    }
}
