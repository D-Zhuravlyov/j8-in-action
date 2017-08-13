package model;

public class Transaction {

    private int year;
    private Double value;
    private Cities city;

    public Transaction(int year, Double value, Cities city) {
        this.year = year;
        this.value = value;
        this.city = city;
    }

    public Double getValue() {
        return value;
    }

    public int getYear() {
        return year;
    }

    public Cities getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "year=" + year +
                ", value=" + value +
                ", city=" + city +
                '}';
    }
}
