package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class VehicleDB {

    public static Vehicle deleteVehicle(Customer customer, String vin) {
        try {
            Connection conn = getConnection();
            Statement st = conn.createStatement();
            System.out.println(vin);
            System.out.println(customer.getVehicle(vin).getVIN());
            String query = "UPDATE Vehicle SET appears = FALSE WHERE vin = \'"+ customer.getVehicle(vin).getVIN() + "\'";
            
            System.out.println("UPDATE Vehicle SET appears = FALSE WHERE vin = \'"+ customer.getVehicle(vin).getVIN() + "\'");
            st.executeUpdate(query);
            st.close();
            conn.close();
            return new Vehicle();

        }catch(Exception e) {
            System.out.println(e);

        }
        return null;

    }

    public static ArrayList<Vehicle> addVehicle(Customer customer) {
        try {
            Connection conn = getConnection();
            Statement st = conn.createStatement();
            Statement st2 = conn.createStatement();

            for (int i = 0; i < customer.getArrayOfVehicles().size(); i++) {
            	String check = "select * from Vehicle WHERE vin ="+ customer.getArrayOfVehicles().get(i).getVIN()+";";
            	ResultSet found = st2.executeQuery(check);
            	if (found.next() == false) {
            		String query = "INSERT INTO Vehicle  Values(\'" +customer.getArrayOfVehicles().get(i).getVIN()+"\',"+customer.getBroncoID()+",\'"
                    +customer.getArrayOfVehicles().get(i).getLicensePlate()+"\',\'"+customer.getArrayOfVehicles().get(i).getVehicleType()+"\',\'"
                    +customer.getArrayOfVehicles().get(i).getVehicleMake()+"\',\'"+customer.getArrayOfVehicles().get(i).getVehicleColor()+"\',"
                    +customer.getArrayOfVehicles().get(i).getModelYear()+",\'"+customer.getArrayOfVehicles().get(i).getState()+"\',"
                    +customer.getArrayOfVehicles().get(i).getAppears()+")";
            		st.executeUpdate(query);
            	}
            	else {
            		continue;
            	}
            }
            
            st.close();
    		st2.close();
    		conn.close();

            return customer.getArrayOfVehicles();

        }catch(Exception e) {
            System.out.println(e);

        }
        return null;
    }

    public static ArrayList<Vehicle> selectVehicle(Customer customer) throws Exception {

        ArrayList<Vehicle> arrayOfVehicles = new ArrayList<>();

        try {

            Connection conn = getConnection();

            Statement st = conn.createStatement();
            String query ="select * from Vehicle WHERE broncoID = " + customer.getBroncoID();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                Vehicle vehicle = new Vehicle();

                vehicle.setVin(rs.getString("vin"));
                rs.getInt("broncoID");
                vehicle.setLicensePlate(rs.getString("licensePlate"));
                vehicle.setVehicleType(rs.getString("vehicleType"));
                vehicle.setVehicleMake(rs.getString("vehicleMake"));
                vehicle.setVehicleColor(rs.getString("vehicleColor"));
                vehicle.setModelYear(rs.getInt("vehicleYear"));
                vehicle.setState(rs.getString("state"));

                arrayOfVehicles.add(vehicle);
            }
            st.close();
            conn.close();
            return arrayOfVehicles;

        }catch(Exception e) {
            System.out.println(e);

        }
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
            return conn;
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;

    }
}
