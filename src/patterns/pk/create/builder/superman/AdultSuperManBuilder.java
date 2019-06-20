package patterns.pk.create.builder.superman;

public class AdultSuperManBuilder extends Builder {

    @Override
    public SuperMan getSuperMan() {
        super.setBody("强壮的身体");
        super.setSpecialTalent("会飞行");
        super.setSpecialSymbol("胸前带 S 标记");
        return super.superMan;
    }
}
