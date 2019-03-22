import java.io.*; 
import java.util.*;

public class DeserializeDemo
{
	public static void main(String args[])
	{
		try
		{

			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emp.ser"));
			//Person2 p1 = (Person2)ois.readObject();
			ArrayList obj = (ArrayList)ois.readObject();

			Iterator i = obj.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}

			//System.out.println(p1.name);
			//System.out.println(p1.age);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}