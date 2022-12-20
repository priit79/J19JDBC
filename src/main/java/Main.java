import controllers.Item;
import controllers.Customer;
import controllers.menu.Menu;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Customer.createCustomerTable();
        Item.getAllItems();
//        Item.createNewItem();
//        Item.getAllItems();

//        Item.updateItem();
//        Item.getAllItems();

        Menu.mainMenu();
    }
}