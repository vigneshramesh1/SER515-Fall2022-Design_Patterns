package PTBS;

import java.util.ArrayList;

public class ClassProductList {

    ArrayList<Product> productList;

    ProductIterator productIterator;

    ClassProductList(ArrayList<Product> products) {
        productList = products;
        productIterator = new ProductIterator(this);
    }

    ArrayList<Product> getProductList() {
        return productList;
    }

    void accept(NodeVisitor visitor) {
        // Visitor pattern is implemented here
        System.out.println("Accept visitor in ClassProductList class");
        visitor.visitProduct(this.productList.get(0));
    }
}
