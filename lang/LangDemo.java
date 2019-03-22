public class LangDemo 
{
	public static void main(String args[]) 
	{
		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println(Math.sqrt(25));
		System.out.println(Math.cbrt(25));
		System.out.println(Math.ceil(3.1));
		System.out.println(Math.floor(3.9));
		System.out.println(Math.round(3.5));
		int random = (int)(Math.random() * 1000);
		System.out.println(random);

		System.out.println("-----------------------------");

		String str = "Hello Everybody";
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.replace('e','-'));
		System.out.println(str.charAt(8));
		System.out.println(str.indexOf('e'));
		System.out.println(str.lastIndexOf('e'));

		System.out.println("-----------------------------");

		String s1 = "hello";
		s1.toUpperCase();
		System.out.println(s1);
		s1 = s1.toUpperCase();
		System.out.println(s1);

		StringBuffer sb1 = new StringBuffer("Hello");
		sb1.append("Hi");
		System.out.println(sb1);

		String str1 = "Hello";
		String str2 = "Hello";

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

		StringBuffer sb2 = new StringBuffer("Hello");
		StringBuffer sb3 = new StringBuffer("Hello");
		
		System.out.println(sb2.hashCode());
		System.out.println(sb3.hashCode());

		int a = 100;
		Integer i = new Integer(a);
		
		System.out.println(i.toBinaryString(i));
		System.out.println(i.toHexString(i));
		System.out.println(i.toOctalString(i));
		System.out.println(i.toString() + 10);

		String s = "1050";
		System.out.println(Integer.parseInt(s) + 10);
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);


	}
}