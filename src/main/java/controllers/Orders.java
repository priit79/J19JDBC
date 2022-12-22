package controllers;

import db.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Orders {
    static Connection connection = Database.DbConn();
    static PreparedStatement ps;
    static ResultSet rs;
    static Scanner scanner = new Scanner(System.in);

    public static boolean createOrderTable() {
        try {
            ps = connection.prepareStatement(
                    "CREATE TABLE IF NOT EXISTS orders(" +
                            "sale_id int NOT NULL, " +
                            "item_id int NOT NULL, " +
                            "qty_purchased int NOT NULL, " +
                            "item_total int NOT NULL, " +
                            "FOREIGN KEY(sale_id) REFERENCES sales(id), " +
                            "FOREIGN KEY(item_id) REFERENCES items(id))");

            ps.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}