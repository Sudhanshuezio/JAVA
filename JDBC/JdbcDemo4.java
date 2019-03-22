import java.sql.*;
import java.io.*;

public class JdbcDemo4
{
	public static void main(String args[])
	{
		try
		{
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));				

				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password-1");
				Statement stmt = con.createStatement();
				
				System.out.print("Enter table name: ");
				String table = br.readLine(); 
				ResultSet rs = stmt.executeQuery("select * from " + table );
				ResultSetMetaData rsmd = rs.getMetaData();

				int cols = rsmd.getColumnCount();

				while(rs.next())
				{
					for(int i=1;i<=cols;i++) 
					{
						System.out.println(rsmd.getColumnName(i)+" : " + rs.getString(i));
					}
					System.out.println();
				}
				rs.close();
				stmt.close();
				con.close();
				
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}
}
