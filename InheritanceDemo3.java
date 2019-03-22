class A 
{
	public void abc() {
		System.out.println("HI");
	}
}

class B extends A 
{
	public void abc() {
		System.out.println("HELLO");
	}
}

class C extends B {
	public void abc() {
		System.out.println("THANKS");
	}
}

public class InheritanceDemo3 {
		public static void main(String args[]) {
		A a1 = new A();
		a1.abc();
		a1= new B();
		a1.abc();
		a1 = new C();
		a1.abc();
	}
}