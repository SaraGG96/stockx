package edu.teamrocket;
import java.util.List;

public class LastSale implements Criteria {

    public LastSale() {}

    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream()
                .filter(offer -> offer instanceof Sale)
                .toList();
    }
    
}
