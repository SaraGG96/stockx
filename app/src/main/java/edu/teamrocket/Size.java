package edu.teamrocket;
import java.util.List;

public class Size implements Criteria {

    public Size() {}

    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream()
                .filter(offer -> offer.size().equals("10"))
                .toList();
    }
    
}
