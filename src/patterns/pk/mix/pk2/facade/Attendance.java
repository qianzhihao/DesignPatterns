package patterns.pk.mix.pk2.facade;

import java.util.Random;

public class Attendance {
    public int getWorkDays() {
        return (new Random()).nextInt(30);
    }
}
