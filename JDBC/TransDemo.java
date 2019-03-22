import java.sql.*;
import java.io.*;

public class JdbcDemo
{
	public static void main(String args[])
	{
		try
		{
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));				

				Class.forName("oracle.jdbc.driver.OracleDrive");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system/*(Username)*/","tiger/*(Password)*/");
				
				con.setAutoCommit(false);
				PreparedStatement pstmt = con.prepareStatement("insert into EMP calues(?, ?)");
				for(int i=1;i<=10;i++) 
				{
					System.out.println("\nEnter name: ");
					String name = br.readLine();
					System.out.println("Enter age: ");
					int age = Integer.parseInt(br.readLine());

					pstmt.setString(1, name);
					pstmt.setInt(2,age);
					pstmt.execute();
				
					if(i==5) 
						con.rollback();
					if(i==10)
						con.commit();
				}
				con.close();
				
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}
}
