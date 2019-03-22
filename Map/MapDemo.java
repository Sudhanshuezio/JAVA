import java.util.*;

public class MapDemo
{
	public static void main(String args[])
	{
		//Hashtable obj = new Hashtable();
		//HashMap obj = new HashMap();
		//TreeMap obj = new TreeMap();
		LinkedHashMap obj = new LinkedHashMap();
		
		obj.put("222","Sumit");
		obj.put("111","Sahay");
		obj.put("444","Shubham");
		obj.put("666","Kumar");
		obj.put("555","Sumit and Shubham");
		obj.put("333","Sumit");

		Set s = obj.entrySet();
		Iterator i = s.iterator();
		//while(i.hasNext())
		//{
		//	System.out.println(i.next());
		//}

		while(i.hasNext()) 
		{
			Map.Entry me = (Map.Entry)i.next();
			System.out.println("ID: " + me.getKey());
			System.out.println("Name: " + me.getValue());
			System.out.println();
		}

	}
}