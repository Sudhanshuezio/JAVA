package assignment;
import java.util.*;
import java.io.*;

public abstract class Employee {

	public String name;
	public int age;
	public float salary;
	public String designation;
	public static int count = 0;
	
	public Employee(String desig) {
		
		System.out.println("Enter details for " + desig + " :-");
		Scanner sc = new Scanner(System.in);
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


	
	public final void display() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Salary: " + this.salary);
		System.out.println("Designation: " + this.designation);
		System.out.println();
	}

	public abstract void raiseSalary(); 

}