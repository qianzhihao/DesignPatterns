package patterns.pk.behavior.pk2.abstractFactory;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        System.out.println("===Children's main work===");
        context.setWork(new ChildWork());
        context.work();
        System.out.println("===Adults' main work===");
        context.setWork(new AdultWork());
        context.work();
        System.out.println("===Old people's main work===");
        context.setWork(new OldWork());
        context.work();
    }
}
