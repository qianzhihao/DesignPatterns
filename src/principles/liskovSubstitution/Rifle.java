package principles.liskovSubstitution;

public class Rifle extends AbstractGun {
    @Override
    public void shoot() {
        System.out.println("步枪射击...");
    }
}
