import java.util.*;

public class UtilDemo
{
	public static void main(String args[]) 
	{
		Date d1 = new Date();
		System.out.println(d1);
		Date d2 = new Date();
		d2.setTime(-82343213123l);
		System.out.println(d2);

		d1.setMonth(45);
		System.out.println(d1);

		System.out.println(d1.after(d2));
		System.out.println(d1.before(d2));
		System.out.println(d1.equals(d2));

		System.out.println("-------------------------------------");

		String str = "Raju-25|20000|Tester|raju@gmail.com;Bangalore,Karnataka:9897878798";
		StringTokenizer st = new StringTokenizer(str,"|;:-");
		int count = st.countTokens();
		for(int i=0;i<count;i++) 
		{
			System.out.println(st.nextToken());
		}

		System.out.println("-------------------------------------");

		Stack s1 = new Stack();
		s1.push("111");
		s1.push("222");
		s1.push("333");
		s1.push("444");
		s1.push("555");

		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
	

		System.out.println(s1.peek());
		System.out.println(s1.peek());
		System.out.println(s1.peek());

		System.out.println(s1.pop());

		System.out.println(s1.search("777"));
		System.out.println(s1.empty());

	}
}