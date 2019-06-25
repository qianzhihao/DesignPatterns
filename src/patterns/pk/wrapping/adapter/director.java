package patterns.pk.wrapping.adapter;

public class director {
    public static void main(String[] args) {
        System.out.println("===Acting progress simulate===");
        IStar star = new FilmStar();
        star.act("first 15mins, star's time");
        IActor actor = new UnknownActor();
        IStar standin = new Standin(actor);
        standin.act("middle 5mins, standin's time");
        star.act("last 15mins, star's time");
    }
}
