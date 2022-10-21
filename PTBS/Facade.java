package PTBS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Facade {

    Login loginObj = new Login();

    Facade() {
        // Facade pattern is implemented here - it provides an additional interface layer
        System.out.println("Facade pattern implemented here.");

    }

    //    The type of the user: Buyer: 0, Seller 1
    int UserType;

    //    The object that holds the currently selected product.
    Product theSelectProduct;

    //    The selected product category: 0: Meat, 1: Produce.
    int nProductCategory;

    //     The list of products of the entire system.
    ClassProductList theProductList;

    ClassProductList allProductList;

    HashMap<String, String> allProductsTypeMap;

    //     The current user.
    Person thePerson;

    int login(UserInformation userInfo) {
        return loginObj.login(userInfo);
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
        Reminder reminder = new Reminder(theProductList);
    }

    void createUser(UserInformation userinfoitem) {
        loginObj.addUser(userinfoitem);
    }

    void createProductList(String username) {
        ArrayList<Product> productList = new ArrayList<Product>();
        try {
            File myObj = new File("UserProduct.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] product = data.split(":");
                if(product[0].equalsIgnoreCase(username)){
                    productList.add(new Product(product[1], allProductsTypeMap.get(product[1])));
                }
            }
            myReader.close();
            theProductList = new ClassProductList(productList);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading UserProduct.txt file.");
            e.printStackTrace();
        }
    }

    void allProductList() {
        ArrayList<Product> productList = new ArrayList<Product>();
        allProductsTypeMap = new HashMap<>();
        try {
            File myObj = new File("ProductInfo.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] product = data.split(":");
                productList.add(new Product(product[0], product[1]));
                allProductsTypeMap.put(product[1], product[0]);
            }
            myReader.close();
            allProductList = new ClassProductList(productList);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading ProductInfo.txt file.");
            e.printStackTrace();
        }
    }

    void viewAllProducts(){
        System.out.println("Iterator pattern implemented here.");
        ProductIterator productIterator = allProductList.productIterator;
        while (productIterator.hasNext()){
            Product product = productIterator.Next();
            System.out.println(product.productType + ":" + product.productName);
        }
    }

    void viewMyProducts(){
        System.out.println("Iterator pattern implemented here.");
        ProductIterator productIterator = theProductList.productIterator;
        while (productIterator.hasNext()){
            Product product = productIterator.Next();
            System.out.println(product.productType + ":" + product.productName);
        }
    }

    void attachProductToUser() {

    }

    Product selectProduct() {
        return new Product();
    }

    void productOperation() {

    }

    void accept(NodeVisitor visitor) {
        // Visitor pattern is implemented here
        System.out.println("Accept visitor in Facade class");
        visitor.visitFacade(this);
    }
}
