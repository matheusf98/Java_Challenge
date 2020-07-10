package br.com.creditsuisse.challenge.business;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {

    public List<String> calcRisk(List<ITrade> trades) {

        ArrayList<String> risks = new ArrayList<>();

        trades.forEach(trade -> {

            if(trade.getValue() < 1000000 && trade.getClientSector().equals("Public")) {
                risks.add("LOWRISK");
            } else if (trade.getValue() > 1000000 && trade.getClientSector().equals("Public")) {
                risks.add("MEDIUMRISK");
            } else if (trade.getValue() > 1000000 && trade.getClientSector().equals("Private")) {
                risks.add("HIGHRISK");
            }
        });

        return risks;

    }
}
