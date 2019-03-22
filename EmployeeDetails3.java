package assignment;
import java.util.Scanner;

abstract class Employee {

	private String name;
	private int age;
	private float salary;
	private String designation;
	public static int count = 0;
	
	public Employee(String desig) {
		count++;
		System.out.println("Enter details for " + desig + " :-");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		setName(sc.nextLine());
		System.out.println("Enter age: ");
		setAge(sc.nextInt());
		System.out.println();
	}

	
	public final void display() {
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Salary: " + getSalary());
		System.out.println("Designation: " + getDesignation());
		System.out.println();
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public float getSalary() {
		return salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public abstract void raiseSalary(); 

}

final class Clerk extends Employee{
	public Clerk() {
		super("Clerk");
		setSalary(8000);
		setDesignation("Clerk");
	}

	public void raiseSalary() {
		float salary = getSalary();
		salary += 2000;
		setSalary(salary);
	}		
	
}

final class Programmer extends Employee{
	public Programmer() {
		super("Programmer");
		setSalary(25000);
		setDesignation("Programmer");
	}
		
	public void raiseSalary() {
		float salary = getSalary();
		salary += 5000;
		setSalary(salary);
	}
}

final class Manager extends Employee{
	public Manager() {
		super("Manager");
		setSalary(80000);
		setDesignation("Manager");
	}
		
	public void raiseSalary() {
		float salary = getSalary();
		salary += 10000;
		setSalary(salary);
	}
}

public class EmployeeDetails3 {
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


		
		