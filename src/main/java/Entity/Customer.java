package Entity;

public class Customer {

	private String location;
	private String destination;
	private int number;
	
	
	public Customer()
	{
		this("nowhere","nowhere",0);
	}
	
	public Customer(String location, String destination, int number)
	{
		super();
		this.location = location;
		this.destination = destination;
		this.number = number;
	}
	
	public String getLocation() 
	{
		return location;
	}
	
	public void setLocation(String location) 
	{
		this.location = location;
	}
	
	public String getDestination() 
	{
		return destination;
	}
	
	public void setDestination(String destination) 
	{
		this.destination = destination;
	}
	public int getNumber() 
	{
		return number;
	}
	public void setNumber(int number) 
	 {
		this.number = number;
	 }
	public String toString() 
	{
		return "Customer [location=" + location + ", destination=" + destination + ", number=" + number + "]";
	}
}

