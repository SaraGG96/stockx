package edu.teamrocket;
import java.util.List;

public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    public List<Offer> checkCriteria(Item item) {
        List<Offer> offers = criteria.checkCriteria(item);
        List<Offer> otherOffers = otherCriteria.checkCriteria(item);
        offers.retainAll(otherOffers);
        return offers;
    }

    
}
