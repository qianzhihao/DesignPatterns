package patterns.abstractFactory.example;

public class MaleFactory implements HumanFactory {
    //生产出黑人男性
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
    //生产出白人男性
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }
    //生产出黄种人男性
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

}
