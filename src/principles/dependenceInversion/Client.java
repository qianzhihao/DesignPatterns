package principles.dependenceInversion;

public class Client {
    public static void main(String[] args) {
        Driver zhangSan = new Driver();
        ICar benz = new Benz();
//        zhangSan.setCar(benz);
        //张三开奔驰
        zhangSan.drive(benz);
//        zhangSan.drive();

        ICar bmw = new BMW();
//        zhangSan.setCar(bmw);
        //张三开宝马
        zhangSan.drive(bmw);
//        zhangSan.drive();
    }
}
