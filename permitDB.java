package application;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PermitDB {

    public static void addPermit(Permit permit)  throws Exception{

        try {
            Connection conn = getConnection();
            Statement st = conn.createStatement();
            String query = "INSERT INTO Permit (rateID,vin)  Values("+permit.getRateID()+",\'"+permit.getVIN()+"\')";
            st.executeUpdate(query);
            st.close();
            conn.close();
        }catch(Exception e) {
            System.out.println(e);

        }

    }
    
    public static Connection getConnection() {
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/cpp_parking_system";
            String username = "root";
            String password = "Eman9232";//password
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            return conn;
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;

    }
}
