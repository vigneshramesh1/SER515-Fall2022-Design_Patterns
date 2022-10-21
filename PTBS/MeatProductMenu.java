package PTBS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class MeatProductMenu implements ProductMenu {
    @Override
    public void showMenu() {
        try {
            File obj = new File("ProductInfo.txt");
            Scanner reader = new Scanner(obj);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                String[] arrOfStr = data.split(":");
                if(arrOfStr[0].equalsIgnoreCase("Meat")){
                    System.out.println(arrOfStr[0] + ":" +  arrOfStr[1]);
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading ProductInfo.txt file.");
            e.printStackTrace();
        }
    }

    @Override
    public void showAddButton() {

    }

    @Override
    public void showViewButton() {

    }

    @Override
    public void showRadioButton() {

    }

    @Override
    public void showLabels() {

    }

    @Override
    public void showComboxes() {

    }
}
