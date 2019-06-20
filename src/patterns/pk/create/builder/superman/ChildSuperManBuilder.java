package patterns.pk.create.builder.superman;

public class ChildSuperManBuilder extends Builder {

    @Override
    public SuperMan getSuperMan() {
        super.setBody("强壮的身体");
        super.setSpecialTalent("刀枪不入，快速移动");
        super.setSpecialSymbol("胸口带小 S 标记");
        return super.superMan;
    }
}
