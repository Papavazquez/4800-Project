package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PaymentMethodDB {
	public PaymentMethod deletePaymentMethod(Customer customer) {
        try {
            Connection conn = getConnection();
            Statement st = conn.createStatement();
            String query = "DELETE FROM PaymentMethod WHERE broncoID = " + customer.getBroncoID();
            st.executeUpdate(query);
            st.close();
            conn.close();
            return new PaymentMethod();

        }catch(Exception e) {
            System.out.println(e);

        }
        return null;
    }
    
    
    public void addPaymentMethod(Customer customer)  throws Exception{

        try {
            Connection conn = getConnection();
            Statement st = conn.createStatement();
            String query = "INSERT INTO PaymentMethod  Values("+customer.getBroncoID()+","+customer.getPayment().getCardNumber()+","
                    +customer.getPayment().getSecurityCode()+","+customer.getPayment().getExpDateM()+","
                    +customer.getPayment().getExpDateY()+",\'"+customer.getPayment().getFirstName()+"\',\'"
                    +customer.getPayment().getLastName()+"\',\'"+customer.getPayment().getBillingAddress()+"\',\'"
                    +customer.getPayment().getZIP()+"\')";
            st.executeUpdate(query);
            st.close();
            conn.close();

        }catch(Exception e) {
            System.out.println(e);

        }

    }
	public PaymentMethod selectPaymentMethod(Customer customer) throws Exception
    {
        PaymentMethod paymentMethod = new PaymentMethod();
        try {
            Connection conn = getConnection();

            Statement st = conn.createStatement();
            String query ="select * from PaymentMethod WHERE broncoID = " + customer.getBroncoID();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
            	rs.getInt("broncoID");
                paymentMethod.setCardNumber(rs.getLong("cardNumber"));
                paymentMethod.setSecurityCode(rs.getInt("securityCode"));
                paymentMethod.setExpDateM(rs.getInt("expirationDateMonth"));
                paymentMethod.setExpDateY(rs.getInt("expirationDateYear"));
                paymentMethod.setFirstName(rs.getString("firstName"));
                paymentMethod.setLastName(rs.getString("lastName"));
                paymentMethod.setBillingAddress(rs.getString("address"));
                paymentMethod.setZIP(rs.getInt("zip"));

            }
            st.close();
            conn.close();
            return paymentMethod;
        }catch(Exception e) {System.out.println(e);}
        return null;
    }

    public static Connection getConnection() {
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/cpp_parking_system";
            String username = "root";
            String password = "Eman9232";//password
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, username, password);
            //System.out.println("connection made in payment");
            return conn;
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;

    }
}
