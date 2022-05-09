package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerDB {

public Customer selectCustomer(Customer customer) throws Exception
{
	try {
		Connection con = getConnection();
		
		PreparedStatement statement = con.prepareStatement("SELECT firstName, lastName, emailAddress, address, checkStudent FROM customer WHERE broncoID =" + customer.getBroncoID());
		
		ResultSet result = statement.executeQuery();
		
		while(result.next())
		{
			customer.setFirstName(result.getString("firstName"));
			customer.setLastName(result.getString("lastName"));
			customer.setEmailAddress(result.getString("emailAddress"));
			customer.setAddress(result.getString("address"));
			customer.setStudent(result.getBoolean("checkStudent"));
		}
		
		return customer;
	}catch(Exception e) {System.out.println(e);}
	return null;
}

public static Connection getConnection() throws Exception
{
	try {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/cpp_parking_system";//jdbc:mysql://portNumber/databseName
		String username = "root";
		String password = "Eman9232";
		Class.forName(driver);
		
		Connection conn = DriverManager.getConnection(url, username, password);
		//System.out.println("Connected");
		
		return conn;
	}catch (Exception e) {System.out.println(e);}
	
	return null;
}

}
