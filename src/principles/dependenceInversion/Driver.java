package principles.dependenceInversion;

public class Driver implements IDriver{

//    private ICar car;
//
//    public void setCar(ICar car) {
//        this.car = car;
//    }

    //司机的主要职责就是驾驶汽车
    public void drive(ICar car) {
//        this.car.run();
        car.run();
    }
}
