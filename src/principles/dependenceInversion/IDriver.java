package principles.dependenceInversion;

public interface IDriver {

//    public void setCar(ICar car);

    //是司机就应该会驾驶汽车
    public void drive(ICar car);
}
