package database;

import java.sql.*;
import java.util.*;

public class DatabaseArrayList{
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tables", "root", "admin");
            ResultSet rs = con.createStatement().executeQuery("select * from programs");

            ArrayList<ArrayList<String>> data = new ArrayList<>();

            while (rs.next()) {
                ArrayList<String> temp = new ArrayList<>();
                temp.add(rs.getString(1));
                temp.add(rs.getString(2));
                data.add(temp);
            }

            for(ArrayList<String> i : data) {
                System.out.println(i);
            }
            con.close();
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
