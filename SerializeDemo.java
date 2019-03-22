import java.io.*; 
import java.util.*;

public class SerializeDemo
{
	public static void main(String args[])
	{
		try
		{
			//Person2 p1 = new Person2();
			//p1.name = "Ravi";
			//p1.age = 25;

			ArrayList obj = new ArrayList();

			obj.add(new Person2("Ram",25));
			obj.add(new Person2("Arya Stark",19));
			obj.add(new Person2("Jon Snow",32));
			obj.add(new Person2("Danaerys Targaryen",25));
			obj.add(new Person2("Jamie Lannister",37));
			

			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.ser"));
			oos.writeObject(obj);

			System.out.println("Successfully serialized.....");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}