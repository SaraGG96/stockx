package edu.teamrocket;
import java.util.List;

public class Min implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public Min(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    public List<Offer> checkCriteria(Item item) {
        List<Offer> offers = new java.util.ArrayList<>(criteria.checkCriteria(item));
        List<Offer> otherOffers = otherCriteria.checkCriteria(item);
        offers.addAll(otherOffers);

        return offers.stream()
                .min(Offer::compareTo)
                .stream()
                .toList();
    }
    
}
