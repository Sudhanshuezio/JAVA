package assignment;
import java.util.*;
import java.io.*;
import java.sql.*;

public abstract class Employee {

	public String name;
	public int age;
	public float salary;
	public String designation;
	public static int count = 0;
	public int eid;
	
	public Employee(String desig) {
		
		System.out.println("Enter details for " + desig + " :-");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID: ");
		this.eid = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name: ");
		this.name = sc.nextLine();
		try 
		{
			System.out.println("Enter age: ");
			this.age = sc.nextInt();
			if(age<21 || age>60)
			throw new InvalidAgeException();	
		}

		catch (InputMismatchException | InvalidAgeException e)
		{
			age = new InvalidAgeException().readEmpAge();
		}
		System.out.println();
		count++;
		
	}


	
	/*public void writeToFile() {
		String temp = this.name + "|" + this.age + "|" + this.salary + "|" + this.designation;
		try {
						
			File dir = new File("data");
			dir.mkdir();
			File f = new File(dir,"AllEmployees.txt");
			f.createNewFile();
			PrintWriter pw = new PrintWriter(new FileOutputStream(f,true));
			pw.println(temp);
			pw.flush();
			pw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}*/

	/*public static void readFromFile() {
		BufferedReader br = null; 
		try
		{
			br = new BufferedReader(new FileReader("data\\AllEmployees.txt"));
			String contentLine = null;
			while((contentLine=br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(contentLine,"|");
				System.out.println("\nName : "+st.nextToken());
				System.out.println("Age : "+st.nextToken());
				System.out.println("Salary : "+st.nextToken());
				System.out.println("Designation : "+st.nextToken());
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		finally
		{
			
			try 
			{
				if(br != null) 
				{	
					br.close();
				}
			}
			
			catch(Exception e) 
			{
				System.out.println(e);
			}
		}
	}*/

	public void dataStore()
	{
		try
		{
			Connection con = Connector.connect();	
			PreparedStatement stmt = con.prepareStatement("insert into EMPLOYEE values(?,?,?,?,?)");
		
			stmt.setInt(1,this.eid);
			stmt.setString(2,this.name);
			stmt.setInt(3,this.age);
			stmt.setFloat(4,this.salary);
			stmt.setString(5,this.designation);
			stmt.execute();

			stmt.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void display() 
	{
		try
		{
			Connection con = Connector.connect();
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from EMPLOYEE");
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

	public static void deleteData()
	{
		
		try
		{
			Connection con = Connector.connect();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Employee ID: ");
			int eid = sc.nextInt();
			
			Statement stmt = con.createStatement();
			ResultSet rst = stmt.executeQuery("select * from EMPLOYEE where EID="+eid);
			if(rst != null)
			{
				System.out.println("Details of the employee: ");
				ResultSetMetaData rsmd = rst.getMetaData();
				int cols = rsmd.getColumnCount();
		
				while(rst.next())
				{
					for(int i=1;i<=cols;i++) 
					{
						System.out.println(rsmd.getColumnName(i) + " : " + rst.getString(i));
					}
					System.out.println();
				}
				System.out.println("ARE YOU SURE YOU WANT OT DELETE THIS RECORD ?(y/n) ");
				String ch = sc.next();
				if(ch.equalsIgnoreCase("y")) 
				{
					Statement tempst = con.createStatement();
					tempst.executeUpdate("delete from EMPLOYEE where EID=" + eid);	
					System.out.println("EMPLOYEE DETAILS DELETED SUCCESSFULLY");
				}
				else 
				{
					return;			
				}			
			}
			else 
			{
				System.out.println("Details not found!!");
				return;
			}	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}	
			
			
					
	@Override
	public String toString() {
		return "\nName: " + this.name + "\nAge: " + this.age + "\nSalary: " + this.salary + "\nDesignation: " + this.designation + "\n";
	}

	public abstract void raiseSalary(); 

	public static void raiseSalaryData()
	{
		try
		{
			Connection con = Connector.connect();
			Statement stmt = con.createStatement();
			stmt.addBatch("update EMPLOYEE set SALARY=SALARY+2000 where DESIGNATION = 'Clerk'");
			stmt.addBatch("update EMPLOYEE set SALARY=SALARY+5000 where DESIGNATION = 'Programmer'");
			stmt.addBatch("update EMPLOYEE set SALARY=SALARY+10000 where DESIGNATION = 'Manager'");

			stmt.executeBatch();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}