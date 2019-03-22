package assignment;

public final class Clerk extends Employee{
	public Clerk(){
		super("Clerk");
		salary = 8000;
		designation = "Clerk";
		this.dataStore();
		
	}

	public void raiseSalary() {
		salary += 2000;
	}

	
	
}