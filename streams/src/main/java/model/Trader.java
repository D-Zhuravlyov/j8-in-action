package model;

public class Trader {

    String name;
    private City city;

    public Trader(String name, City city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public City getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "name='" + name + '\'' +
                ", city=" + city +
                '}';
    }
}
