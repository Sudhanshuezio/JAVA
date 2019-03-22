package assignment;

public final class Manager extends Employee{
	public Manager() {
		super("Manager");
		salary = 80000;
		designation = "Manager";
		this.dataStore();
	}
		
	public void raiseSalary() {
		salary += 10000;
	}
}