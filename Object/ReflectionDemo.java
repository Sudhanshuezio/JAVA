import java.lang.reflect.*;


public class ReflectionDemo 
{
	public static void main(String args[]) 
	{
		Class c1 = class.forName(args[0});
		Object obj = c1.newInstance(obj);

		System.out.println(obj);

		Method m[] = c1.getMethods();
		Field f[] = c1.getFields();
		Constructor c[]=c1.getConstructors();

		System.out.println("class:" + c1.getName());
		System.out.pritnln("{");
		for(int i=0;i<m.length;i++) 
		{
			System.out.println("\t" + m[i].getname() + "()");
		}
		System.out.println("}");
	}
} 