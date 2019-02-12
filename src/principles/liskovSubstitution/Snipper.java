package principles.liskovSubstitution;

/**
 * 狙击手
 */
public class Snipper {

    private AUG aug;

    public void setRifle(AUG aug) {
        this.aug = aug;
    }
    public void killEnemy() {
        aug.zoomOut();
        aug.shoot();
    }
}
