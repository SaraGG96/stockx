package edu.teamrocket;
import java.util.List;

public class Bids implements Criteria {

    public Bids() {}

    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream()
                .filter(offer -> offer instanceof Bid)
                .toList();
    }
    
}
