import java.util.*;

class NameSorter implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		Person p1 = (Person)o1;
		Person p2 = (Person)o2;
		
		String n1 = p1.name;
		String n2 = p2.name;
		
		return n1.compareTo(n2);

	}
}


class AgeSorter implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		Person p1 = (Person)o1;
		Person p2 = (Person)o2;
		
		Integer n1 = p1.age;
		Integer n2 = p2.age;
		
		return n1.compareTo(n2);

	}
}



class ReverseAgeSorter implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		Person p1 = (Person)o1;
		Person p2 = (Person)o2;
		
		Integer n1 = p1.age;
		Integer n2 = p2.age;
		
		return n2.compareTo(n1);

	}
}