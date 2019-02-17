package Entity;

public class Cab_Manager {
 
	    private String email;
	    private String password;
	    
	    public Cab_Manager()
	    {
	        this("default@gmail.com","123456");	        
	    }
	            
	    public Cab_Manager(String email, String password)
	    {
	    	super();
	        this.email = email;
	        this.password = password;
	    }
	   
	   public void Set_email(String email)
	   {
		   this.email = email;
	   }
	    
	   public void Set_password(String password)
	   {
	        this.password = password;
	   }
	   
	   public String Get_email()
	   {
	       return email;
	   }
	   
	   public String Get_password()
	   {
	       return password;
	   }
	}



