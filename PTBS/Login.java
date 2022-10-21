package PTBS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Login {
    HashMap<String, String> usercreds;

    HashMap<String, Integer> users;

    Login(){
        users = new HashMap<>();
        usercreds = new HashMap<>();
        try {
            File obj1 = new File("BuyerInfo.txt");
            Scanner reader1 = new Scanner(obj1);
            File obj2 = new File("SellerInfo.txt");
            Scanner reader2 = new Scanner(obj2);
            while (reader1.hasNextLine()) {
                String data = reader1.nextLine();
                String[] s = data.split(":");
                usercreds.put(s[0], s[1]);
                users.put(s[0], 0);
            }
            while (reader2.hasNextLine()) {
                String data = reader2.nextLine();
                String[] s = data.split(":");
                usercreds.put(s[0], s[1]);
                users.put(s[0], 1);
            }
            reader1.close();
            reader2.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading BuyerInfo.txt or SellerInfo.txt file.");
            e.printStackTrace();
        }
    }

    void addUser(UserInformation userInfo){
        if(usercreds!=null && usercreds.containsKey(userInfo.username)){
            System.out.println("User " + userInfo.username + " already exists.");
            return;
        }
        else {
            usercreds.put(userInfo.username, userInfo.password.toString().trim());
            System.out.println("User " + userInfo.username + " created.");
            users.put(userInfo.username, userInfo.UserType);
        }
    }

    int login(UserInformation userInfo){
        if(!usercreds.containsKey(userInfo.username)){
            System.out.println("User " + userInfo.username + " doesn't exist.");
            return -1;
        }
        if(!usercreds.get(userInfo.username).equals(userInfo.password.toString().trim())){
            System.out.println("Invalid username/password.");
            return -1;
        }
        else {
            System.out.println("Hello " + userInfo.username + "!");
            return users.get(userInfo.username);
        }
    }
}
