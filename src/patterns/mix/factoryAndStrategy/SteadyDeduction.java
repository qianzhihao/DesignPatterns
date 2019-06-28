package patterns.mix.factoryAndStrategy;

public class SteadyDeduction implements IDeduction {
    @Override
    public boolean exec(Card card, Trade trade) {
        int halfMoney = (int)Math.rint(trade.getAmount() / 2.0);
        card.setFreeMoney(card.getFreeMoney());
        card.setSteadyMoney(card.getSteadyMoney() - halfMoney);
        return true;
    }
}
