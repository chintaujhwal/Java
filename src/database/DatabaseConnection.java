package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DatabaseConnection {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "admin");
            ResultSet rs = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE).executeQuery("select * from employees");

// to print all rows using COLUMN NAME and COLUMN NUMBER ------------------------------- next()
            while (rs.next())
                System.out.println(rs.getInt("id") + " - " + rs.getString(2));
// ------------------------------------------------------------------------------------- first()
//            rs.first();
//            System.out.println(rs.getInt(1) + " - " + rs.getString(2));
// ------------------------------------------------------------------------------------- last()
//            rs.last();
//            System.out.println(rs.getInt(1) + " - " + rs.getString(2));
// ------------------------------------------------------------------------------------- absolute()
//            rs.absolute(2);
//            System.out.println(rs.getInt(1) + " - " + rs.getString(2));
// ------------------------------------------------------------------------------------- previous()
//            rs.absolute(2);
//            System.out.println(rs.getInt(1) + " - " + rs.getString(2));
//            rs.next();
//            System.out.println(rs.getInt(1) + " - " + rs.getString(2));
// ------------------------------------------------------------------------------------- next()
//            rs.absolute(2);
//            System.out.println(rs.getInt(1) + " - " + rs.getString(2));
//            rs.next();
//            System.out.println(rs.getInt(1) + " - " + rs.getString(2));
// ------------------------------------------------------------------------------------- relative()
//            rs.absolute(4);
//            System.out.println(rs.getInt(1) + " - " + rs.getString(2));
//            rs.relative(-2);
//            System.out.println(rs.getInt(1) + " - " + rs.getString(2));
//            rs.relative(1);
//            System.out.println(rs.getInt(1) + " - " + rs.getString(2));
//            con.close();
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
