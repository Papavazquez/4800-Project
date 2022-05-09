package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RateDB {
    public static boolean checkFaculty (Customer customer) {
        try {
            Connection conn = getConnection();
            Statement st = conn.createStatement();
            String query = "SELECT studentCheck FROM Rate WHERE rateID = " + customer.getBroncoID();
            ResultSet result = st.executeQuery(query);

            st.close();
            conn.close();
            return result.getBoolean("checkStudent");

        }catch(Exception e) {
            System.out.println(e);

        }
        return false; // I return false here so if the system can't find anything we assume it is a student

    }

    public static Connection getConnection() {
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/cpp_parking_system";
            String username = "root";
            String password = "****";//password
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            return conn;
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;

    }
}
