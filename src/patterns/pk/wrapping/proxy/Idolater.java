package patterns.pk.wrapping.proxy;

public class Idolater {
    public static void main(String[] args) {
        IStar star = new Singer();
        IStar agent = new Agent(star);
        System.out.println("Idolater: Please make a sign for me!");
        agent.sign();
    }
}
