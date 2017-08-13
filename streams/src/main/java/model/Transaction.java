package model;

public class Transaction {

    private int year;
    private Double value;
    private Trader trader;

    public Transaction(int year, Double value, Trader trader) {
        this.year = year;
        this.value = value;
        this.trader = trader;
    }

    public Double getValue() {
        return value;
    }

    public int getYear() {
        return year;
    }

    public Trader getTrader() {
        return trader;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "year=" + year +
                ", value=" + value +
                ", trader=" + trader +
                '}';
    }
}
