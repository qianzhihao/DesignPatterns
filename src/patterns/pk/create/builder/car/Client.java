package patterns.pk.create.builder.car;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        System.out.println("===制造一辆奔驰SUV===");
        ICar benzSuv = director.createBenzSuv();
        System.out.println(benzSuv);
        System.out.println("\n===制造一辆宝马商务车===");
        ICar bmwVan = director.createBMWVan();
        System.out.println(bmwVan);
        System.out.println("\n===制造一辆混合车===");
        ICar complexCar = director.createComplexCar();
        System.out.println(complexCar);
    }
}
