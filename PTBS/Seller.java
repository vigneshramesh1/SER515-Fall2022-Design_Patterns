package PTBS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Seller extends Person {
    @Override
    void showMenu(int productCategory) {
        System.out.println("Bridge pattern implemented here.");
        System.out.println("Factory Method pattern implemented here.");
        //        Factory Method pattern will determine which class to instantiate.;
        if(productCategory == 0){
            //            Bridge pattern implemented here - show MeatProductMenu for a Seller
            MeatProductMenu meatProductMenu = new MeatProductMenu();
            meatProductMenu.showMenu();
        }
        if(productCategory == 1){
            //            Bridge pattern implemented here - show ProduceProductMenu for a Seller
            ProduceProductMenu produceProductMenu = new ProduceProductMenu();
            produceProductMenu.showMenu();
        }
    }

    @Override
    ProductMenu createProductMenu() {
        return null;
    }
}
