package edu.teamrocket;
import java.util.List;

public class MinAsk implements Criteria {

    public MinAsk() {}

    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream()
                .filter(offer -> offer instanceof Ask)
                .sorted((o1, o2) -> ((Ask) o1).value() - ((Ask) o2).value())
                .limit(1)
                .toList();
    }
    
}
