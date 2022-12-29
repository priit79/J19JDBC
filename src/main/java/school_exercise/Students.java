package school_exercise;

import db.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Students {
    static Connection connection = Database.DbConn();
    static PreparedStatement ps;
    static ResultSet rs;
    static Scanner scanner = new Scanner(System.in);

    public static void createStudentsTable() {
        try {
            ps = connection.prepareStatement(
                    "CREATE TABLE IF NOT EXISTS students(" +
                            " id serial," +
                            " first_name varchar(255)," +
                            " last_name varchar(255)," +
                            " age int,");
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

/*    public static boolean createNewStudent() {
        // Add prompts to tell the user what data they need to enter next
        System.out.print("Enter the student first name: ");
        String fName = scanner.nextLine();

        System.out.print("Enter the student last name: ");
        String lName = scanner.nextLine();

        System.out.print("Enter the age: ");
        String age = scanner.nextLine();

        try {
            ps = connection.prepareStatement("INSERT INTO students(first_name, last_name, age) " +
                    "VALUES('" + fName + "', '" + lName + "', '" + age + "')");

            ps.execute();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void deleteStudent() {
        System.out.println("Enter the id of the student to delete: ");
        int id = scanner.nextInt();

        try {
            ps = connection.prepareStatement("DELETE FROM students WHERE student_id = " + id);
            ps.execute();

            ps = connection.prepareStatement("DELETE FROM students WHERE id = " + id);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static boolean updateStudent() {
        // Prompt the user for info
        System.out.println("Possible fields to update: first_name, last_name, age");

        System.out.print("Enter the field name: ");
        String fieldName = scanner.nextLine();

        System.out.print("Enter the value for the field: ");
        String fieldValue = scanner.nextLine();

        System.out.print("Enter the students's id: ");
        int id = scanner.nextInt();

        if (!fieldName.equals("first_name") || !fieldName.equals("last_name") || !fieldName.equals("age")) {
            System.out.println("Invalid field name");
            updateStudent();
        }

        try {
            ps = connection.prepareStatement("UPDATE students SET " +
                    fieldName + " = '" + fieldValue + "' " + "WHERE id = " + id);
            ps.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public static void getAllStudents() {
        try {
            ps = connection.prepareStatement("SELECT * FROM students");
            rs = ps.executeQuery();

            // Loop through the result set
            while (rs.next()) {
                String id = "id: " + rs.getInt("id");
                String firstName = "first_name: " + rs.getString("first_name");
                String lastName = "last_name: " + rs.getString("last_name");
                String age = "age: " + rs.getInt("age");
                System.out.println(id + ", " + firstName + ", " + lastName + ", " + age);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    } */
}
