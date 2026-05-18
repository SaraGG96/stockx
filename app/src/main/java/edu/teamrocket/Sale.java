package edu.teamrocket;

public class Sale {

    private String size;
    private Integer bid;

    public Sale(String size, Integer bid) {
        this.size = size;
        this.bid = bid;
    }
    
    public String size() {
        return this.size;
    }

    public int value() {
        return this.bid;
    }

    public int compareTo(Offer offer) {
        if (this.value() > offer.value()) {
            return 1;
        } else if (this.value() < offer.value()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Sale: " + this.size() + " for $" + this.value();
    }   
}
