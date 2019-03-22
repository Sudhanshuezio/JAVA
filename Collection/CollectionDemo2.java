import java.util.*;

public CollecitonDemo2
{
	public static void main(String args[])
	{
		//TreeSet obj = new TreeSet();
		HashSet obj = new HashSet();
		//LinkedHashSet obj = new LinkedHashSet();

		//Vector obj = new Vector();
		//ArrayList obj = new ArrayList();
		//LinkedList obj = new LinkedList();

		//PriorityQueue obj = new PriorityQueue();

		obj.add("222");
		obj.add("111");
		obj.add("555");
		obj.add("333");
		obj.add("333");
		obj.add("555");

		Iterator i = obj.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}