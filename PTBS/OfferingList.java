package PTBS;

import java.util.ArrayList;

public class OfferingList {
    ArrayList<String> offeringList;

    OfferingList(ArrayList<String> offerings) {
        offeringList = offerings;
    }

    ArrayList<String> getProductList() {
        return offeringList;
    }
}
