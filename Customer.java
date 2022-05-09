package application;

import java.util.ArrayList;


public class Customer {
	protected int broncoID;
	protected String firstName;
	protected String lastName;
	protected String emailAddress;
	protected String address;
	protected int vehicleCount = 0;
	protected int maxVehicles = 4;
	protected boolean student;
	protected ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	protected PaymentMethod payment;
	private CustomerDB dbc = new CustomerDB();
	private PaymentMethodDB dbpm = new PaymentMethodDB();
	private VehicleDB dbv = new VehicleDB();

	//constructor
	public Customer()
	{
		broncoID=0;
		firstName = "";
		lastName = "";
		emailAddress = "";
		address = "";
		vehicleCount = 0;
		payment = null;
	}
		
	//getters
	public int getBroncoID()
	{
		return broncoID;
	}
		
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getFullName()
	{
		return firstName + " " + lastName;
	}
	public String getEmailAddress()
	{
		return emailAddress;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public boolean getStudent()
	{
		return student;
	}
	
	public Vehicle getVehicle(String vin) throws Exception
	{
		for (int i = 0; i < vehicleCount; i++) {
			if (vehicles.get(i).getVIN().equals(vin)) {
				return vehicles.get(i);
			}
		}
	
		throw new Exception("Vehicle not found");
	}
	
	public ArrayList<Vehicle> getArrayOfVehicles() {
		return vehicles;
	}
	
	public void setArrayListOfVehicles(ArrayList<Vehicle>v)
	{
		vehicles = v;
		vehicleCount = vehicles.size();
	}
	
	public PaymentMethod getPayment() {
		return payment;
	}
		
	//setters
	public void setBroncoID(int id)
	{
		broncoID = id;
	}
	
	public void setFirstName(String name)
	{
		firstName = name;
	}
	
	public void setLastName(String name)
	{
		lastName = name;
	}
	
	public void setEmailAddress(String address)
	{
		emailAddress = address;
	}
	
	public void setStudent(boolean s)
	{
		student = s;
	}

	public void setAddress(String ad) {
		address = ad;	
	}
	
	
	public void addVehicle(Vehicle v) throws Exception
	{
		System.out.println("I'm in the add method");
		if (vehicleCount <= maxVehicles) {
			vehicles.add(v);
			vehicleCount++;
		}
		else {
			throw new Exception("Maximum number of vehicles reached");
		}
	}
	
	public void removeVehicle(String vin) throws Exception {
        Vehicle v = dbv.deleteVehicle(this, vin);
        for (int i = 0; i < vehicleCount; i++) {
            if (vehicles.get(i).getVIN().equals(vin)) {
            	System.out.println("I am in the method");
            	vehicles.remove(vehicles.get(i));
            }
        }

        throw new Exception("Vehicle not found");
    }
	
	
	//public void removeVehicle(String vin) {
	//	for (int i = 0; i < vehicleCount; i++) {
	//		if (vehicles.get(i).getVIN().equals(vin)) {
	//			System.out.println("I am in the method");
	//			vehicles.remove(vehicles.get(i));
	//		}
	//	}
	
		//throw new Exception("Vehicle not found");
	//}
	
	public void setPayment(PaymentMethod p)
	{
		payment = p;
	}
	
	
	
	
	//connection
	public void getInfoFromDBC() throws Exception
	{
		dbc.selectCustomer(this);
	}
	
	//connection and db 
	public PaymentMethod getInfoFromDBPM() throws Exception
	{
		payment = dbpm.selectPaymentMethod(this);
		return payment;
	}
	
	@SuppressWarnings("static-access")
	public void getInfoFromDBV() throws Exception {
		vehicles = dbv.selectVehicle(this);
		vehicleCount = vehicles.size();
	}
	
	@SuppressWarnings("static-access")
	public void updateDBV() {
		vehicles = dbv.addVehicle(this);
	}
	
	
	public void deleteInfoFromDBPM()
	{
		payment = dbpm.deletePaymentMethod(this);
	}
	
	public void addInfoToDBPM() throws Exception
	{
		dbpm.addPaymentMethod(this);
	}

}
