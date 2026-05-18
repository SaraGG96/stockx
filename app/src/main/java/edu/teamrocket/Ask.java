package edu.teamrocket;

public class Ask implements Offer {

    private String size;
    private Integer bid;

    public Ask(String size, Integer bid) {
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
        return "Ask: " + this.size() + " for $" + this.value();
    }
    
}
