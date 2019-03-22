import java.sql.*;
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
				
				/*
				CallableStatement cstmt = con.preapareCall("CALL ?");
				
				System.out.println("ENter the procedure name: ");
				cstmt.setString(1,br.readLine());
				cstmt.execute();

				cstmt.close();
				*/
				Statement stmt = con.createStatement();
				stmt.addBatch("insert into EMP values('Ravi',22)");
				stmt.addBatch("insert into EMP values('Ravindra',32)");
				stmt.addBatch("insert into EMP values('Ravish',42)");
				stmt.addBatch("insert into EMP values('Raja',52)");
				stmt.addBatch("insert into EMP values('pratap',28)");
				stmt.addBatch("insert into EMP values('Suman',34)");

				System.out.println("Wait for 30 seconds...");
				Therad.sleep(30000);
				stmt.executeBatch();
				System.out.println("Now check the table...");
				stmt.close();
				con.close();
				
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}
}
