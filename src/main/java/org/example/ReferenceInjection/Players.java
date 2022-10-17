package org.example.ReferenceInjection;

public class Players {

    private Integer number;
    private String name;
    private double strikeRate;

    public Players(Integer number, String name, double strikeRate) {
        this.number = number;
        this.name = name;
        this.strikeRate = strikeRate;
    }

    public Players() {
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStrikeRate() {
        return strikeRate;
    }

    public void setStrikeRate(double strikeRate) {
        this.strikeRate = strikeRate;
    }

    @Override
    public String toString() {
        return "Players{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", strikeRate=" + strikeRate +
                '}';
    }
}
