package assignment;
import java.util.*;
import java.io.*;

public class InvalidInputException extends RuntimeException
{
	public InvalidInputException () 
	{
	}
	
	InvalidInputException(String msg) 
	{
		super(msg);
	}
		
	public int readEmpInput() 
	{
		int inp = 0;
		while(true)
		{
			try
			{
				System.out.println("Invalid Choice");
				System.out.print("Enter choice: ");
				inp = new Scanner(System.in).nextInt();
				
				return inp;
			}

			catch(InputMismatchException e)
			{
				System.out.println("Please enter number only");

			}
		
			catch(InvalidInputException e) 
			{
				System.out.println("Please enter choice between 1 and 4");
			}
		}
	}
}
	