package patterns.pk.wrapping.decorator;

public class FreakStar implements IStar {
    @Override
    public void act() {
        System.out.println("In Drama: bad performance!");
    }
}
