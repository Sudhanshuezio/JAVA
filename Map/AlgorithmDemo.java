 import java.util.*;

public class AlgorithmDemo
{
	public static void main(String args[])
	{
		LinkedList list = new LinkedList();
		list.add("111");
		list.add("222");
		list.add("444");
		list.add("777");
		list.add("333");
		list.add("666");
		list.add("555");

		//Collections.reverse(list);
		//Collections.sort(list);
		//Collections.shuffle(list);
		Collections.swap(list,2,5);

		Iterator i = list.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}