package assignment;
import java.util.*;
import java.io.*;
import java.sql.*;

public class Connector
{
	public static Connection connect() 
	{
		Connection con = null;
		try
		{	
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password-1");	
				
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
		return con;
	}
}
		
		