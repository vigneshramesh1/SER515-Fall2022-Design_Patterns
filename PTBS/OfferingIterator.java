package PTBS;

import java.util.ArrayList;

public class OfferingIterator implements ListIterator{
    ArrayList<Offering> offerings;

    int size;
    Offering cur;
    Offering next;

    int index;

    OfferingIterator(OfferingList offeringList){
        // Iterator pattern is implemented here - it iterates over the Offering List
        System.out.println("Iterator pattern implemented here.");
        offerings = offeringList.getOfferingList();
        size = offerings.size();
        cur = null;
        index = 0;
        next = offerings.isEmpty() ? null : offerings.get(0);
    }

    @Override
    public boolean hasNext() {
        if (index == size) {
            return false;
        }
        return true;
    }

    @Override
    public Offering Next() {
        if (!hasNext()) {
            return null;
        }
        cur = next;
        ++index;
        next = !hasNext() ? null : offerings.get(index);
        return cur;
    }

    @Override
    public void MoveToHead() {
        cur = null;
        index = 0;
        next = offerings.isEmpty() ? null : offerings.get(0);
    }

    @Override
    public void Remove() {
        offerings.remove(index);
        size--;
        cur = next;
        ++index;
        next = !hasNext() ? null : offerings.get(index);
    }
}
