package br.com.creditsuisse.challenge.test;

import br.com.creditsuisse.challenge.business.ITrade;
import br.com.creditsuisse.challenge.business.Portfolio;
import br.com.creditsuisse.challenge.business.TradeImpl;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        ITrade trade1 = new TradeImpl(2000000, "Private");
        ITrade trade2 = new TradeImpl(400000, "Public");
        ITrade trade3 = new TradeImpl(500000, "Public");
        ITrade trade4 = new TradeImpl(3000000, "Public");

        List<ITrade> trades = new ArrayList<>();
        trades.add(trade1);
        trades.add(trade2);
        trades.add(trade3);
        trades.add(trade4);

        List<String> tradeCategories = new Portfolio().calcRisk(trades);

        System.out.println(tradeCategories);

    }

}
