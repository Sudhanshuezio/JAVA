public class Person2 implements java.io.Serializable
{
	String name;
	transient int age;

	public Person2() {}

	public Person2(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public String toString()
	{
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		return "";
	}
}