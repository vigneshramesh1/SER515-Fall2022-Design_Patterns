package PTBS;

import java.util.HashMap;

public abstract class Person {
    private ProductMenu theProductMenu;

    abstract void showMenu(int productCategory);

    void showAddButton() {

    }

    void showViewButton() {

    }

    void showRadioButton() {

    }

    void showLabels() {

    }

    abstract ProductMenu createProductMenu();

}
