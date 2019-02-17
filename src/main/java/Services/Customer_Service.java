/**
 * 
 */
package Services;

import Entity.Station;

/**
 * @author Demar Johnson
 *
 */
public class Customer_Service extends Station
{	
	public boolean req_av(Station s) // check for taxo's availability in the station
	{
		boolean available = false;
		if (Station_count()>0 )
		{
			available = true; 
		}
		else
		{
			available = false;
		}			 
		return available;
	}
	
	public boolean con_cab()  // books a cab for trip
	{
		boolean confirm = false;
		if ( ) // something
		{
			confirm = true;
		}
		else
		{
			confirm = false;
		}
		return confirm;
	}
	
	public double req_price (Customer c) //checks the price of the selected journey length
	{
		double price = 0.0;
		int l = 0;
		int d = 0;
		price = 350 + (c.req_dist(l, d) * 20);
		return price;
	}
	
	public int req_dist(int l, int d)  // string length as parameters  |   checks distance of journey
	{
		int diff;
		diff = d - l; 
		return diff;
	}
	public boolean con_pkup()  //signals that the confirmed cab has arrived to do pickup
	{
		return false;
	}
	
	public boolean con_arr()  //signals that the confirmed cab has delivered passenger to correct destination 
	{
		return false;
		
	}
}

