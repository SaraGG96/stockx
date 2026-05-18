package edu.teamrocket;
import java.util.List;

public class MaxBid implements Criteria {

    public MaxBid() {}

    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream()
                .filter(offer -> offer instanceof Bid)
                .sorted((o1, o2) -> ((Bid) o2).value() - ((Bid) o1).value())
                .limit(1)
                .toList();
    }
    
}