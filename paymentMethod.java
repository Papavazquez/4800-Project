package application;

public class PaymentMethod {
	private long cardNumber;//pk
	  private int securityCode;
	  private int expDateM;
	  private int expDateY;
	  private String firstName;
	  private String lastName;
	  private String billingAddress; 
	  private int zip;
	  
	  //constructor
	  public PaymentMethod()
	  {
	    cardNumber = 0;
	    securityCode = 0;
	    expDateM = 0;
	    expDateY = 0;
	    firstName = "";
	    lastName = "";
	    billingAddress = "";
	    zip = 0;
	  }
	  public PaymentMethod(long cardNumber, int securityCode, int expDateM, int expDateY, String firstName, String lastName, String billingAddress, int zip)
	  {
	    this.cardNumber = cardNumber;
	    this.securityCode = securityCode;
	    this.expDateM = expDateM;
	    this.expDateY = expDateY;
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.billingAddress = billingAddress;
	    this.zip = zip;
	  }
	  //methods 
	  //mutators
	  /**
	  setCreditCard method stores a value into creditCard field
	  @param cn The value to store in creditCard
	  */
	  public void setCardNumber(long cn)
	  {
	    cardNumber = cn;
	  }
	  
	  
	  /**
	  setSecurityCode method stores a value into securityCode field
	  @param sc The value to store in securityCode
	  */
	  public void setSecurityCode(int sc)
	  {
	    securityCode = sc;
	  }
	  
	  
	  /**
	  setExpDateM method stores a value into expDate field
	  @param ba The value to store in expDate
	  */
	  public void setExpDateM(int ed)
	  {
	    expDateM = ed;
	  }
	  
	  /**
	  setExpDateM method stores a value into expDate field
	  @param ba The value to store in expDate
	  */
	  public void setExpDateY(int ed)
	  {
	    expDateY = ed;
	  }
	  
	  
	  /**
	  setFirstName method stores a value into name field
	  @param ba The value to store in name
	  */
	  public void setFirstName(String n)
	  {
	    firstName = n;
	  }
	  /**
	  setLastName method stores a value into name field
	  @param ba The value to store in name
	  */
	  public void setLastName(String n)
	  {
	    lastName = n;
	  }
	  /**
	  setBillingAddress method stores a value into billingAddress field
	  @param ba The value to store in billingAddress
	  */
	  public void setBillingAddress(String ba)
	  {
	    billingAddress = ba;
	  }
	  
	  /**
	  setZIP method stores a value into zip field
	  @param ba The value to store in zip
	  */
	  public void setZIP(int z)
	  {
	    zip = z;
	  }
	  
	  //accessors
	  /**
	  getCardNumber method returns PaymentMethod object's cardNumber
	  @return The value in cardNumber
	  */
	  public long getCardNumber()
	  {
	    return cardNumber;
	  }
	  
	  /**
	  getSecurityCode method returns PaymentMethod object's securityCode
	  @return The value in securityCode
	  */
	  public int getSecurityCode()
	  {
	    return securityCode;
	  }
	  
	  
	  /**
	  getExpDate method returns PaymentMethod object's expDate
	  @return The value in expDate
	  */
	  public int getExpDateM()
	  {
	    return expDateM;
	  }
	  
	  /**
	  getExpDate method returns PaymentMethod object's expDate
	  @return The value in expDate
	  */
	  public int getExpDateY()
	  {
	    return expDateY;
	  }
	  
	  /**
	  getName method returns PaymentMethod object's name
	  @return The full name
	  */
	  public String getName()
	  {
	    return firstName + " " + lastName;
	  }
	  
	  /**
	  getFirstName method returns PaymentMethod object's name
	  @return The value in firstName
	  */
	  public String getFirstName()
	  {
	    return firstName;
	  }
	  
	  /**
	  getFirstName method returns PaymentMethod object's name
	  @return The value in firstName
	  */
	  public String getLastName()
	  {
	    return lastName;
	  }
	  /**
	  getBillingAddress method returns PaymentMethod object's billingAddress
	  @return The value in billingAddress
	  */
	  public String getBillingAddress()
	  {
	    return billingAddress;
	  }
	  
	  public int getZIP()
	  {
		  return zip;
	  }
	
	 
}
