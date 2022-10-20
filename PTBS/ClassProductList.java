package PTBS;

import java.util.ArrayList;

public class ClassProductList {

    ArrayList<String> productList;

    ClassProductList(ArrayList<String> products) {
        productList = products;
    }

    ArrayList<String> getProductList() {
        return productList;
    }
}
