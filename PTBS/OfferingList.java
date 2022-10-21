package PTBS;

import java.util.ArrayList;

public class OfferingList {
    ArrayList<Offering> offeringList;

    OfferingIterator offeringIterator;

    OfferingList(ArrayList<Offering> offerings) {
        offeringList = offerings;
        offeringIterator = new OfferingIterator(this);
    }

    ArrayList<Offering> getOfferingList() {
        return offeringList;
    }

}
