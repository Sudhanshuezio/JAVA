import java.util.*;

interface Emp {
	void display();
	void raiseSalary();
}

class Clerk implements Emp{
	private float salary = 8000;
	private String designation = "Clerk";
	String name;
	int age;

	public Clerk() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		this.name = sc.nextLine();
		System.out.println("Enter age: ");
		this.age = sc.nextInt();
	}

	
	@Override
	public void display() {
		System.out.println("Name: " + this.name + "\nAge: " + this.age + "\nDesignation: " + this.designation + "\nAnnual Salary: " + 					(this.salary*12));
	}

	@Override
	public void raiseSalary() {
		this.salary += 2000;
	}
}

class Programmer implements Emp{
	private float salary = 25000;
	private String designation = "Programmer";
	String name;
	int age;

	public Programmer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		this.name = sc.nextLine();
		System.out.println("Enter age: ");
		this.age = sc.nextInt();
	}
	
	@Override
	public void display() {
		System.out.println("Name: " + this.name + "\nAge: " + this.age + "\nDesignation: " + this.designation + "\nAnnual Salary: " + 					(this.salary*12)); 
	}

	@Override
	public void raiseSalary() {
		this.salary += 5000;
	}
}

class Manager implements Emp{
	private float salary = 80000;
	private String designation = "Manager";
	String name;
	int age;

	public Manager() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		this.name = sc.nextLine();
		System.out.println("Enter age: ");
		this.age = sc.nextInt();
	}
	
	@Override
	public void display() {
		System.out.println("Name: " + this.name + "\nAge: " + this.age + "\nDesignation: " + this.designation + "\nAnnual Salary: " + 				(this.salary*12));
	}

	@Override
	public void raiseSalary() {
		this.salary += 10000;
	}
}

public class EmployeeDetails {
	public static void main(String args[]) {
		Clerk c = new Clerk();
		Programmer p = new Programmer();
		Manager m = new Manager();
		c.display();
		p.display();
		m.display();
		System.out.println("----------------------------");
		System.out.println("After salary raise: ");
		c.raiseSalary();
		p.raiseSalary();
		m.raiseSalary();
		c.display();
		p.display();
		m.display();	
	}
}
		


