package patterns.pk.wrapping.decorator;

public class Client {
    public static void main(String[] args) {
        IStar freakStar = new FreakStar();
        freakStar = new HotAir(freakStar);
        freakStar = new Deny(freakStar);
        System.out.println("===Here is a Case for FreakStar===");
        freakStar.act();
    }
}
