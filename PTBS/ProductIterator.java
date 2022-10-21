package PTBS;

import java.util.ArrayList;

public class ProductIterator implements ListIterator {

    ArrayList<Product> products;

    int size;
    Product cur;
    Product next;

    int index;

    ProductIterator(ClassProductList productList){
        // Iterator pattern is implemented here - it iterates over the Products List
        System.out.println("Iterator pattern implemented here.");
        products = productList.getProductList();
        size = products.size();
        cur = null;
        index = 0;
        next = products.isEmpty() ? null : products.get(0);
    }

    @Override
    public boolean hasNext() {
        if (index == size) {
            return false;
        }
        return true;
    }

    @Override
    public Product Next() {
        if (!hasNext()) {
            return null;
        }
        cur = next;
        ++index;
        next = !hasNext() ? null : products.get(index);
        return cur;
    }

    @Override
    public void MoveToHead() {
        cur = null;
        index = 0;
        next = products.isEmpty() ? null : products.get(0);
    }

    @Override
    public void Remove() {
        products.remove(index);
        size--;
        cur = next;
        ++index;
        next = !hasNext() ? null : products.get(index);
    }
}
