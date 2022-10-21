package PTBS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Product Trading and Bidding System (PTBS):");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice: ");
        System.out.println("1. Create new user" + "\n" +
                "2. Login");
        int inp = sc.nextInt();
        System.out.println("Enter username:");
        String username = sc.next();
        System.out.println("Enter password:");
        String password = sc.next();
        UserInformation userInfo = new UserInformation(username, password);

        // Instantiate Facade interface class
        Facade facade = new Facade();
        if(inp == 1){
            System.out.println("Enter 0 for Buyer and 1 for Seller profile:");
            userInfo.UserType = sc.nextInt();
            facade.createUser(userInfo);
        }
        int userType = facade.login(userInfo);
        if (userType != -1){
            facade.UserType = userType;
            facade.allProductList();
            facade.createProductList(username);
        }
        else{
            return;
        }
        System.out.println("Enter choice: ");
        System.out.println("1. View All Product Menu" + "\n" +
                "2. View All Produce Product Menu" + "\n" +
                "3. View All Meat Product Menu" + "\n" +
                "4. View My Product Menu" + "\n" +
                "5. Trade" + "\n" +
                        "6. Exit  " + "\n"
        );
        inp = sc.nextInt();
        while(inp != 6){
            if(inp == 1){
                facade.viewAllProducts();
            } else if (inp == 2) {
                facade.nProductCategory = 1;
                if(userType == 0){
                    Buyer buyer = new Buyer();
                    buyer.showMenu(facade.nProductCategory);
                } else {
                    Seller seller = new Seller();
                    seller.showMenu(facade.nProductCategory);
                }
            }
            else if (inp == 3) {
                facade.nProductCategory = 0;
                if(userType == 0){
                    Buyer buyer = new Buyer();
                    buyer.showMenu(facade.nProductCategory);
                } else {
                    Seller seller = new Seller();
                    seller.showMenu(facade.nProductCategory);
                }
            }
            else if (inp == 4) {
                facade.viewMyProducts();
            }
            else if (inp == 5) {
                if(userType == 0){
                    System.out.println("Bidding logic");
                } else {
                    facade.remind();
                }
            }
            System.out.println("Enter choice: ");
            System.out.println("1. View All Product Menu" + "\n" +
                    "2. View All Produce Product Menu" + "\n" +
                    "3. View All Meat Product Menu" + "\n" +
                    "4. View My Product Menu" + "\n" +
                    "5. Trade" + "\n" +
                    "6. Exit  " + "\n"
            );
            inp = sc.nextInt();
        }
    }
}