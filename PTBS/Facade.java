package PTBS;

import java.util.List;

public class Facade {

    int UserType = 0;

    Product theSelectProduct;

    int nProductCategory = 1;

    List<Product> theProductList;

    Person thePerson;

    boolean login() {
        return true;
    }

    void addTrading() {

    }

    void viewTrading() {

    }

    void decideBidding() {

    }

    void discussBidding() {

    }

    void submitBidding() {

    }

    void remind() {

    }

    void createUser(UserInformation userinfoitem) {

    }

    void createProductList() {

    }

    void attachProductToUser() {

    }

    Product selectProduct() {
        return new Product();
    }

    void productOperation() {

    }
}
