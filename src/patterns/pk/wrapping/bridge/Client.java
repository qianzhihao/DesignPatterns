package patterns.pk.wrapping.bridge;

public class Client {
    public static void main(String[] args) {
        AbsStar James = new FilmStar();
        AbsStar Lisa = new Singer();

        James.doJob();
        Lisa.doJob();
        Lisa = new Singer(new ActFilm());
        Lisa.doJob();
    }
}
