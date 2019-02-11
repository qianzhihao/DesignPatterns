package principles.liskovSubstitution;

public class Soldier {
    private AbstractGun gun;
    public void setGun(AbstractGun _gun){
        this.gun = _gun;
    }
    public void killEnemy() {
        System.out.println("士兵开始杀敌...");
        gun.shoot();
    }
}
