package PTBS;

import java.util.ArrayList;

public class Product {

    String productName;

    String productType;

    ArrayList<Trading> tradings;

    public Product(String productName, String productType) {
        this.productName = productName;
        this.productType = productType;
    }

    public Product() {
        this.productName = "";
        this.productType = "";
        tradings = new ArrayList<>();
    }

    void addTrading(Trading trading){
        tradings = new ArrayList<>();
        this.tradings.add(trading);
    }

    public void setTradings(ArrayList<Trading> tradings) {
        this.tradings = tradings;
    }
}
