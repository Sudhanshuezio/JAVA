import java.util.*;

class Person 
{
	String name;
	int age;

	public Person(String n, int a)
	{
		name = n;
		age = a;
	}

	public String toString() 
	{
		return "Name: " + this.name + " Age: " + this.age;
	} 

	//public int compareTo(Person p)
	//{
	//	return this.age-p.age;
	//}
}

class Demo
{
	public static void main(String args[]) 
	{
		TreeSet<Person> t = new TreeSet<Person>(new NameSorter());
		t.add(new Person("sumit",95));
		t.add(new Person("Sahay",65));
		t.add(new Person("Shubham",12));


		Iterator<Person> i = t.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

		System.out.println("-----------------------------");
		LinkedList list = new LinkedList();
		
		list.add(new Person("Jon Snow",30));
		list.add(new Person("Arya Stark",20));
		list.add(new Person("Tyrion Lannister",38));
		list.add(new Person("Cersei Lannister",40));
		list.add(new Person("Danaerys targaryaen",32));

		Collections.sort(list,new NameSorter());
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
}