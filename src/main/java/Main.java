import controllers.Customer;
import controllers.Item;
import controllers.Orders;
import controllers.Sales;
import controllers.menu.Menu;

public class Main {
    public static void main(String[] args) {
        Customer.createCustomerTable();
        Item.createItemsTable();
        Sales.createSalesTable();
        Orders.createOrderTable();
        // subsequent objects will have their create table
        // methods here

        Menu.mainMenu();
    }

    // 25 mins
    // Add 2 features to this application that allows the user to view
    // all the orders and all the sales.


    // Exercise:
    // Complete the sales class by adding the following methods.
    // Add a method called createNewSale:
    // - collate the total price of all the items bought using the
    // handleItemsTotal method and log the total to the console.






}