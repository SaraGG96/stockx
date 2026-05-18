package edu.teamrocket;
import java.util.List;

public class Size implements Criteria {

    private String size;

    public Size(String size) {
        this.size = size;
    }

    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream()
                .filter(offer -> offer.size().equals(size))
                .toList();
    }
    
}
