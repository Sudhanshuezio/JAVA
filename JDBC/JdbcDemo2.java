import java.sql.*;

public class JdbcDemo
{
	public static void main(String args[])
	{
		try
		{
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));				

				Class.forName("oracle.jdbc.driver.OracleDrive");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system/*(Username)*/","tiger/*(Password)*/");
				PreparedStatement stmt = con.prepareStatement("insert into EMP calues(?,?)");
				
				System.out.println("Enter Name: ");
				String name = br.readLine();
				System.out.println("Enter age: ");
				int age = Integer.parseInt(br.readLine());
			
				pstmt.setString(1,name);
				pstmt.setInt(2,age);
				pstmt.execute();

				pstmt.close();
				con.close();

				
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}
}
