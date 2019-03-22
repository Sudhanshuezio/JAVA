package assignment;
import java.util.*;

class NameSorter implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;

		String n1 = e1.name.toLowerCase();
		String n2 = e2.name.toLowerCase();
	
		return n1.compareTo(n2);
	}
}

class AgeSorter implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;
		
		Integer n1 = e1.age;
		Integer n2 = e2.age;
		
		return n1.compareTo(n2);

	}
}

class SalarySorter implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;
		
		Float n1 = e1.salary;
		Float n2 = e2.salary;
		
		return n1.compareTo(n2);

	}
}
