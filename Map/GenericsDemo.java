import java.util.*;

public class GenericsDemo
{
	public static void main(String args[])
	{
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("HELLO");
		list.add("Sumit");
		list.add("Oh Yeah");
		list.add("Shubham");

		
		/*for(String a : list)
		{
			System.out.println(a);
		}*/

		Iterator<>Object i = list.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

		HashMap<Integer, String> h = new HashMap<Integer,String>();

		h.put(111,"abc");
		h.put(222,"def");
		h.put(333,"ghi");
		h.put(444,"jkz");

	
		
	}
}

		