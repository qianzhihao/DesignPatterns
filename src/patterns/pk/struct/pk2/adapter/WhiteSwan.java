package patterns.pk.struct.pk2.adapter;

import patterns.pk.struct.pk2.decorator.Swan;

public class WhiteSwan implements Swan {
    @Override
    public void fly() {
        System.out.println("It can Fly");
    }

    @Override
    public void cry() {
        System.out.println("Kloo~Kloo~Kloo~");
    }

    @Override
    public void desAppearance() {
        System.out.println("pur white, very lovely");
    }
}
