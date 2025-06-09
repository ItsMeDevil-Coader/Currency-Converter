package model;

public class Currency {
    private int id;
    private String fromCurrency;
    private String toCurrency;
    private double rate;

    public Currency(int id, String fromCurrency, String toCurrency, double rate) {
        this.id = id;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.rate = rate;
    }

    public int getId() { return id; }
    public String getFromCurrency() { return fromCurrency; }
    public String getToCurrency() { return toCurrency; }
    public double getRate() { return rate; }
}