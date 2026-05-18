package edu.teamrocket;
import java.util.ArrayList;
import java.util.List;

public class Max implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public Max(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    public List<Offer> checkCriteria(Item item) {
        List<Offer> offers = new ArrayList<>(criteria.checkCriteria(item));
        List<Offer> otherOffers = otherCriteria.checkCriteria(item);
        offers.addAll(otherOffers);
        return offers.stream()
                .max(Offer::compareTo)
                .stream()
                .toList();
    }

    
}
