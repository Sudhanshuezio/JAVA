package assignment;
import java.util.*;
import java.io.*;

public class UserInterface {
	public static void display()  {
		System.out.println("\tEmployee Details");
		int choice;
		ArrayList<Employee> e1 = new ArrayList<Employee>();
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("--------------------------------");
			System.out.println("Main Menu");
			System.out.println("--------------------------------");
			System.out.println("1. Create");
			System.out.println("2. Display");
			System.out.println("3. Raise Salary");
			System.out.println("4. Delete");
			System.out.println("5. Exit");
			System.out.println("--------------------------------");
		  try
		  {
			choice = sc.nextInt();
		  }
		  catch(InputMismatchException ez) 
		  {
			System.out.println("Only numeric input allowed");
			choice = new InvalidInputException().readEmpInput();
		  }
			switch(choice) {
				case 1:	int ec;
					do {
						System.out.println("--------------------------------");
						System.out.println("Enter your choice");
						System.out.println("1. Clerk");
						System.out.println("2. Programmer");
						System.out.println("3. Manager");
						System.out.println("4. Exit");	
						System.out.println("--------------------------------");
					  try
					  {	
						
						Scanner scan = new Scanner(System.in);
						int ech = scan.nextInt();
						ec=ech;
					  }
				
					  catch(InputMismatchException ez)
					  {
						System.out.println("Only numeric input allowed");
						int ech = new InvalidInputException().readEmpInput();
						ec = ech;
					  }
						switch(ec) {
							case 1:	//e1[i] = new Clerk();
								e1.add(new Clerk());
								//i++;
								break;
								
							case 2:	//e1[i] = new Programmer();
								e1.add(new Programmer());
								//i++;
								break;
							
							case 3: //e1[i] = new Manager();
								e1.add(new Manager());
								//i++;
								break;
							
							case 4:	break;
		
							default: System.out.println("Invalid Option");
							}		
					} while(ec != 4);
					break;
					
				case 2:	/*int chDisplay;
					do {
						System.out.println("--------------------------------");
						System.out.println("Sort By");
						System.out.println("1. Name");
						System.out.println("2. Age");
						System.out.println("3. Salary");
						System.out.println("4. Exit");	
						System.out.println("--------------------------------");
					  try
					  {
						Scanner sc1 = new Scanner(System.in);
						int ece = sc1.nextInt();
						chDisplay = ece;
					  }
				  	  
					  catch(InputMismatchException emi)
					  {
						int eceh = new InvalidInputException().readEmpInput();
						chDisplay = eceh;
					  }
						switch(chDisplay) {
							case 1:	Collections.sort(e1,new NameSorter());
								break;
								
							case 2:	Collections.sort(e1,new AgeSorter());
								break;
							
							case 3: Collections.sort(e1,new SalarySorter());
								break;
							
							case 4:	break;
		
							default: System.out.println("Invalid Option");
							}
							
							Iterator<Employee> it = e1.iterator();
							while(it.hasNext())
							{
								System.out.println(it.next());
							}		
					} while(chDisplay != 4);*/
					//Employee.readFromFile();
					Employee.display();
					break;
 
				case 3:	/*Iterator<Employee> itx = e1.iterator();
					while(itx.hasNext())
					{
						itx.next().raiseSalary();
					}*/
					Employee.raiseSalaryData();
					break;
				
				case 4: Employee.deleteData();
					break;

				case 5:	System.exit(0);
				default: System.out.println("Wrong Choice");
			}
			
		} while(choice != 5);
	}
}
		
				