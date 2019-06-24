package patterns.pk.mix.pk2.facade;

import java.util.Random;

public class Tax {
    public int getTax() {
        return (new Random()).nextInt(300);
    }
}
