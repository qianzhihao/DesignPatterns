package patterns.abstractFactory.example;

public interface HumanFactory {
    //制造一个黄种人
    public Human createYellowHuman();
    //制造一个白种人
    public Human createWhiteHuman();
    //制造一个黑种人
    public Human createBlackHuman();

}
