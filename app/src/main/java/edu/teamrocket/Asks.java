package edu.teamrocket;
import java.util.List;

public class Asks implements Criteria {

    public Asks() {}

    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream()
                .filter(offer -> offer instanceof Ask)
                .toList();
    }
    
}
