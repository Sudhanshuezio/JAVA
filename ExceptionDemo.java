import java.util.*;
import java.io.*;

class A {
	public void abc() throws ArithmeticException, IOException, UserException
	{
		int a =50;
		for(int i=0;i<=20;i++) {
			System.out.println(i);
			int res = a/(a-i);
			if(i==150)
				throw new NullPointerException();
			if(i==120)
				throw new IOException();
			if(i==100)
				return;
			if(i==80)
				throw new UserException("When i is 8");
			if(i == 60) 
				throw new UserException("When i is 6");
		}
	}

	public void xyz() throws ArithmeticException, IOException, UserException
	{
		abc();
	}
	
	public void atoz() throws ArithmeticException, IOException, UserException
	{
		xyz();
	}
}

public class ExceptionDemo
{
	public static void main(String args[]) {
		try {
			A a1 = new A();
			a1.atoz();
		}
		catch(IOException e)
		{
			System.out.println("Input Output Exception occured...");
		}
		catch(NullPointerException e) 
		{
			System.out.println("Null Exception occured...");
		}
		catch(UserException e) {
			System.out.println("Custom Exception handler...");
			System.out.println("Reason: " + e.getMessage());
			e.printStackTrace();
			e.display();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally 
		{
			System.out.println("THANKS");
		}
		System.out.println("Program continues....");
	}
}

class UserException extends RuntimeException {
	UserException() {
	}

	UserException(String msg)
	{
		super(msg);
	}
	public void display()
	{
		System.out.println("Just for Demo");
	}
}