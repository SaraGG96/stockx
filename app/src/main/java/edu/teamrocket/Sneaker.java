package edu.teamrocket;
import java.util.ArrayList;
import java.util.List;

public class Sneaker implements Item {

    private String style;
    private String name;
    private int sale;
    private int ask;
    private int bid;
    private List<Offer> offers;

    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;
        this.sale = 0;
        this.ask = 0;
        this.bid = 0;
        this.offers = new ArrayList<>();
    }

    @Override
    public int getBid() {
        return bid;
    }

    @Override
    public int getAsk() {
        return ask;
    }

    @Override
    public int getSale() {
        return sale;
    }

    @Override
    public void setBid(int bid) {
        this.bid = bid;
    }

    @Override
    public void setAsk(int ask) {
        this.ask = ask;
    }

    @Override
    public void setSale(int sale) {
        this.sale = sale;
    }

    @Override
    public void add(Offer offer) {
        offers.add(offer);
    }

    @Override
    public List<Offer> offers() {
        return new ArrayList<>(offers);
    }

    @Override
    public String toString() {
        return name + "\n\t\t" + style;
    }
}