package application;

//import java.io.*;
//port java.util.*;

import java.io.*;
import java.util.*;

class Vehicle
{
  //attributes
  private String vin;//pk
  private String licensePlate;//pk
  private String vehicleType;
  private String vehicleMake;
  private String vehicleColor;
  private int modelYear;
  private String state;
  private boolean appears;
  
  //constructor
  public Vehicle()
  {
    this.vin="";//pk
    this.licensePlate="";//pk
    this.vehicleType="";
    this.vehicleMake="";
    this.vehicleColor="";
    this.modelYear=0;
    this.state="";
    this.appears=true;
  }
  public Vehicle(String vin, String licensePlate, String vehicleType, String vehicleMake, String vehicleColor, int modelYear,String state)
  {
    this.vin = vin;
    this.licensePlate = licensePlate;
    this.vehicleType = vehicleType;
    this.vehicleMake = vehicleMake;
    this.modelYear = modelYear;
    this.vehicleColor = vehicleColor;
    this.state = state;
    this.appears = true;
    //create new entry in vehicle table for this customer and fill in the values
  }
  
  /**
  setVIN method stores a string in the vin field
  @param vID The value to store in vin
  */
  public void setVin(String vID)
  {
    this.vin = vID;
  }
  
  /**
  setLicensePlate method stores a string in the licensePlate field
  @param lp The value to store in licensePlate
  */
  public void setLicensePlate(String lp)
  {
    licensePlate = lp;
    //change license plate attribute in database
  }
  
  /**
  setVehicleType method stores a string in the vehicleType field
  @param vt The value to store in vehicleType 
  */
  public void setVehicleType(String vt)
  {
    vehicleType = vt;
  }
  
  /**
  setVehicleMake() method stores a string in the vehicleMake field
  @param vmak Value to store in vehicleMake
  */
  public void setVehicleMake(String vmak)
  {
    vehicleMake = vmak;
  }
  
  public void setModelYear(int mYear)
  {
    modelYear = mYear;
  }
  
  /**
  setVehicleColor method stores a string in the vehicleColor field
  @param vc Value to store in vehicleColor
  */
  
  public void setVehicleColor(String vc)
  {
    vehicleColor = vc;
  }
  
  public void setState(String s)
  {
    state = s;
  }
  
  public void setAppears(Boolean a)
  {
	  appears = a;
  }
  
  //accessors
  /**
  getVIN method returns vin
  @return Value of vin field
  */
  public String getVIN()
  {
    return vin;
  }
  
  /**
  getLicensePlate method returns licensePlate
  @return Value of licensePlate field
  */
  public String getLicensePlate()
  {
    return licensePlate;
  }
  
  /**
  getVehicleType method returns vehicleType
  @return Value of vehicleType field
  */
  public String getVehicleType()
  {
    return vehicleType;
  }
  
   /**
  getVehicleMake method returns vehicleMake
  @return Value of vehicleMake field
  */
  public String getVehicleMake()
  {
    return vehicleMake;
  }
  
  /**
  getModelYear method returns modelYear
  @return Value of modelYear field
  */
  public int getModelYear()
  {
    return modelYear;
  }
  
  /**
  getVehicleColor method returns vehicleColor
  @return Value of vehicleColor field
  */
  public String getVehicleColor()
  {
    return vehicleColor;
  }
  
  /**
  getDriver method returns driver
  @return Value of driver field
  */
  public String getState()
  {
    return state;
  }
  
  public boolean getAppears()
  {
	  return appears;
  }
  
  
}
