package br.com.creditsuisse.challenge.business;

public class TradeImpl implements ITrade {

    private double value;

    private String clientSector;

    public TradeImpl(double value, String clientSector) {
        this.value = value;
        this.clientSector = clientSector;
    }

    @Override
    public double getValue() {
        return this.value;
    }

    @Override
    public String getClientSector() {
        return this.clientSector;
    }
}
