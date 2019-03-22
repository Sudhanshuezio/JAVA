package assignment;
import java.util.*;
import java.io.*;

public class UserInterface {
	public static void display()  {
		System.out.println("\tEmployee Details");
		int choice;
		Employee[] e1 = new Employee[10];
		int i = 0;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Main Menu");
			System.out.println("1. Create");
			System.out.println("2. Display");
			System.out.println("3. Raise Salary");
			System.out.println("4. Exit");
		  try
		  {
			choice = sc.nextInt();
		  }
		  catch(InputMismatchException ez) 
		  {
			choice = new InvalidInputException().readEmpInput();
		  }
			switch(choice) {
				case 1:	int ec;
					do {
						
						System.out.println("Enter your choice");
						System.out.println("1. Clerk");
						System.out.println("2. Programmer");
						System.out.println("3. Manager");
						System.out.println("4. Exit");	
					  try
					  {	
						
						Scanner scan = new Scanner(System.in);
						int ech = scan.nextInt();
						ec=ech;
					  }
				
					  catch(InputMismatchException ez)
					  {
						int ech = new InvalidInputException().readEmpInput();
						ec = ech;
					  }
						switch(ec) {
							case 1:	e1[i] = new Clerk();
								i++;
								break;
								
							case 2:	e1[i] = new Programmer();
								i++;
								break;
							
							case 3: e1[i] = new Manager();
								i++;
								break;
							
							case 4:	break;
		
							default: System.out.println("Invalid Option");
							}		
					} while(ec != 4);
					break;
					
				case 2:	for(int j=0;j<i;j++) {
						e1[j].display();
					}
					break;	
 
				case 3:	for(int j=0;j<i;j++) {
						e1[j].raiseSalary();
					}
					break;
				case 4:	System.exit(0);
				default: System.out.println("Wrong Choice");
			}
			
		} while(choice != 4);
	}
}
		
				