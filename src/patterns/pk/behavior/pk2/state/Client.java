package patterns.pk.behavior.pk2.state;

public class Client {
    public static void main(String[] args) {
        Human human = new Human();
        human.setState(new ChildState());
        System.out.println("===Children's main work===");
        human.work();
        System.out.println("\n===Adults' main work ===");
        human.work();
        System.out.println("\n===Old people's main work===");
        human.work();
    }
}
