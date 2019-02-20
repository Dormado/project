package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import Database.SQL_Provider;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



abstract public class SQL_Provider <T>
{
	protected Connection con = null; // connection object to database
	protected Statement statement = null; // use to execute sql statement
	protected ResultSet result = null; // used to collect result data from 	// database
									
	private static final String DRIVER = "org.sqlite.JDBC"; 
	private static Logger logger = LogManager.getLogger(SQL_Provider.class);


	
	@SuppressWarnings("deprecation")
	public SQL_Provider() 
	{
		try 
		{
			logger.trace("Attempting to connect to database, errors may occur");
			Class.forName(DRIVER).newInstance(); 
			String url = "jdbc:sqlite:inventory.sqlite"; 
			con = DriverManager.getConnection(url);
			
			initSQLDatabase();

			logger.info("Connected to database");
			logger.debug( "Connected to database");

		
		}// end try
		catch (SQLException ex) 
		{
			logger.error("Could not connect to database",ex);
		}// end catch
		catch (ClassNotFoundException ex) 
		{
			logger.error("Failed to load JDBC/OBDC Driver",ex);
		}// end catch
		catch (NullPointerException ex) 
		{
			logger.error("Could not find database",ex);
		}// end catch
		catch (IllegalAccessException ex) 
		{
			logger.error("Unauthorized access to the database",ex);
		} catch (InstantiationException ex) 
		{
			logger.error("Could not create instance of database",ex);
		}

	}

	   abstract protected void initSQLDatabase();
	   
	   abstract public List<T> selectAll();
	   
	   abstract public T get(int id);
	   
	   abstract public int update(T item, int id);
	   
	   abstract public int delete(int id);
	   
	   abstract public int deleteMultiple(int[] ids);
	   
	   abstract public int add(T item);
	   
}
