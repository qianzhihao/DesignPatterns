package patterns.pk.wrapping.adapter;

public class FilmStar implements IStar {
    @Override
    public void act(String context) {
        System.out.println("Star Acting: " + context);
    }
}
