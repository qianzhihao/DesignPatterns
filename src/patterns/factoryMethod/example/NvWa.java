package patterns.factoryMethod.example;

public class NvWa {
    public static void main(String[] args) {
        //声明阴阳八卦炉
        AbstractHumanFactory YinYangLu = new HumanFactory();

        //第一次造人，白人
        System.out.println("--造出的第一批是白人--");
        Human whiteHuman = YinYangLu.createHuman(WhiteHuman.class);
        //第一次造人，黑人
        System.out.println("--造出的第一批是黑人--");
        Human blackHuman = YinYangLu.createHuman(BlackHuman.class);
        //第一次造人，黄种人
        System.out.println("--造出的第一批是黄种人--");
        Human yellowHuman = YinYangLu.createHuman(YellowHuman.class);

    }
}
