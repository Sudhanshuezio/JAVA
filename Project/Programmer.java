package assignment;

public final class Programmer extends Employee{
	public Programmer() {
		super("Programmer");
		salary = 25000;
		designation = "Programmer";
	}
		
	public void raiseSalary() {
		salary += 5000;
	}
}