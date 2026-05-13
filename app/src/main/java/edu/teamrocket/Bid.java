package edu.teamrocket;

public class Bid implements Offer {
    
    private String size;
    private Integer bid;

    Bid (String size, Integer bid) {
        this.size = size;
        this.bid = bid;
    }

    public String size() {
        return this.size;
    }

    public Integer value() {
        return this.bid;
    }


}
