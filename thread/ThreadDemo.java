class A extends Thread 
{
	public void run() 
	{
		for(int i=1;i<=20;i++) 
		{
			System.out.println("i: " + i);
			try 
			{
				if(i%3 == 0)
					Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

class B extends Thread 
{
	public void run() 
	{
		for(int i=1;i<=20;i++) 
		{
			System.out.println("j: " + i);
			try 
			{
				if(i%4 == 0)
					Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

class C extends Thread 
{
	public void run() 
	{
		for(int i=1;i<=20;i++) 
		{
			System.out.println("k: " + i);
			try 
			{
					Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

public class ThreadDemo
{
	public static void main(String args[]) 
	{
		A a1 = new A();
		B b1 = new B();
		C c1 = new C();

		a1.start();
		b1.start();
		c1.start();

		a1.setPriority(7);
		b1.setName("abc");
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
		Thread m1 = Thread.currentthread();
		System.out.println(m1);

		/*for(int i=1;i<=200;i++) {
			System.out.println(i+" ");
			if(i==30)
				b1.suspend();
			if(i==150)
				b1.resume();
			if(i==30)
				a1.suspend();
			m1.sleep(200);
		}*/
		b.join();
		System.out.println("a1 is alive: " + a1.isAlive());
		System.out.println("b1 is alive: " + b1.isAlive());
		System.out.println("c1 is alive: " + c1.isAlive());

		for(int i=0;i<10;i++) 
		{
			System.out.println("Main Exit");
		}
	}
}