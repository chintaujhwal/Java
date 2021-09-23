package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

public class DatabaseManager {
    public static Object GetAll() {
        try {
            HashMap<String, ArrayList<String>> data = new HashMap<>();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tables", "root", "admin");
            Statement stmt = con.createStatement();

            ArrayList<String> l1 = new ArrayList<>();
            ResultSet programs = stmt.executeQuery("select distinct program_id from batches");
            while (programs.next()) {
                l1.add(programs.getString(1));
            }
            data.put("programs", l1);

            ArrayList<String> l2 = new ArrayList<>();
            ResultSet batches = stmt.executeQuery("select distinct batch from batches");
            while (batches.next()) {
                l2.add(batches.getString(1));
            }
            data.put("batches", l2);

            ArrayList<String> l3 = new ArrayList<>();
            ResultSet years = stmt.executeQuery("select distinct batch_year from batches");
            while (years.next()) {
                l3.add(years.getString(1));
            }
            data.put("years", l3);

            con.close();
            return data;
        }
        catch (Exception ex) {
            System.out.println(ex);
            return "Batch not found";
        }
    }

    public static void main(String args[]) {
        GetAll();
    }
}
