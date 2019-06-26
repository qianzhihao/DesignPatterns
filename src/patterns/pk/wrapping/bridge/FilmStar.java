package patterns.pk.wrapping.bridge;

public class FilmStar extends AbsStar {
    public FilmStar() {
        super(new ActFilm());
    }

    public FilmStar(AbsAction _action) {
        super(_action);
    }

    public void doJob() {
        System.out.println("\n===film Star's work===");
        super.doJob();
    }
}
