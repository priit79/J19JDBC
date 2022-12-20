package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

   public static Connection DbConn() {

       // Declare the connection outside the try/catch block to allow you
       // return it after the commands have been executed.


       Connection connection = null;

       try {
           connection = DriverManager.getConnection(
                   "jdbc:postgresql://surus.db.elephantsql.com/mwuukisp",
                   "mwuukisp",
                   "UW_gv0Xejfdi1Y_I4eqZkhUOAbvCTiIx");
       } catch (SQLException e) {
           System.out.println(e.getMessage());
       }

       return connection;
       }
}



