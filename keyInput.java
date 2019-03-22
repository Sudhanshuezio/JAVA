import java.util.*;

class KeyInput {
public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int n = Integer.parseInt(sc.nextLine());
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		System.out.println(name + " is " + n + " years old");
	}
}
