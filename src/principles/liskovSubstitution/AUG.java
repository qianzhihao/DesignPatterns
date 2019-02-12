package principles.liskovSubstitution;

/**
 * 狙击枪
 */
public class AUG extends Rifle {
    //望远镜
    public void zoomOut() {
        System.out.println("通过望远镜查看敌人...");
    }
    public void shoot() {
        System.out.println("AUG射击...");
    }
}
