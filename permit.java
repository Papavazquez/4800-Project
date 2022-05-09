package application;

public class Permit extends Rate {
	
	private int permitNumber;
	int vin;
	
	public Permit() {
		super();
		permitNumber = 0;
		vin = 0;
	}
	
	public Permit(int permitNumber, int vin) {
		super();
		this.permitNumber = permitNumber;
		this.vin = vin;
	}

	public int getPermitNumber()
	{
		return permitNumber;
	}
	public void setPermitNumber (int pn)
	{
		pn = permitNumber + 1;
		permitNumber = pn;
	}
	
	public int getVIN()
	{
		return vin;
	}
	public void setVIN(int v)
	{
		vin = v;
	}

	

}
