package patterns.mix.factoryAndStrategy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) {
        Card card = initIC();
        System.out.println("===Card Init Infomation===");
        showCard(card);
        boolean flag = true;
        while (flag) {
            Trade trade = createTrade();
            DeductionFacade.deduct(card, trade);
            System.out.println("\n======Trade Credential===");
            System.out.println(trade.getTradeNo() + "Trade Success!!!");
            System.out.println("Trade Amount: " + trade.getAmount() / 100.0);
            showCard(card);
            System.out.println("\nExit or Not?(Y/N)");
            if (getInput().equalsIgnoreCase("y")) {
                flag = false;
            }
        }
    }

    private static String getInput() {
        String str = "";
        try {
            str = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    private static Trade createTrade() {
        Trade trade = new Trade();
        System.out.println("Please Enter trade No.:");
        trade.setTradeNo(getInput());
        System.out.println("Please Enter trade amount:");
        trade.setAmount(Integer.parseInt(getInput()));
        return trade;
    }

    private static void showCard(Card card) {
        System.out.println("IC Card No.: " + card.getCardNo());
        System.out.println("Steady Money: " + card.getSteadyMoney());
        System.out.println("FreeMoney: " + card.getFreeMoney());
    }

    private static Card initIC() {
        Card card = new Card();
        card.setCardNo("1100010001000");
        card.setFreeMoney(100000);
        card.setSteadyMoney(80000);
        return card;
    }
}
