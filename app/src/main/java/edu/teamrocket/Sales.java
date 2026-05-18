package edu.teamrocket;
import java.util.List;

public class Sales implements Criteria {

    public Sales() {}

    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream()
                .filter(offer -> offer instanceof Sale)
                .toList();
    }
    
}
