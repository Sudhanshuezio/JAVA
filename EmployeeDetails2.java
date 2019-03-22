import assignment.Employee;
import assignment.Clerk;
import assignment.Programmer;
import assignment.Manager;
import java.util.*;

public class EmployeeDetails2 {
	public static void main(String args[]) {
		Clerk c = new Clerk();
		Programmer p = new Programmer();
		Manager m = new Manager();
		c.display();
		p.display();
		m.display();
		System.out.println("\n----------------------\n");
		System.out.println("\nAfter Salary Raise\n");
		c.raiseSalary();
		p.raiseSalary();
		m.raiseSalary();
		c.display();
		p.display();
		m.display();
		System.out.println("Number of Employees : " + Employee.count);
	}
}


		
		