package application;

//import java.util.*;

public class Cart
{
  private Permit permit;
	  private Customer customer;
	  
	  public Cart()
	  {
	    permit = new Permit();
	    customer = new Customer();
	  }
	  
	  public Cart(Permit p, Customer c)
	  {
	    permit = p;
	    customer = c;
	  }
	  
	  
	  //getters and setters
	  public void setPermit(Permit p)
	  {
	    permit = p;
	  }
	  
	  public void setCustomer(Customer c)
	  {
	    customer = c;
	  }
	  
	  public Permit getPermit()
	  {
	    return permit;
	  }
	  
	  public Customer getCustomer()
	  {
	    return customer;
	  }
	  
  
}//end class
