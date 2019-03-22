public class ArrayDemo {
	public static void main(String args[]) {
		int arr[] = {11,22,33,44,55,66,77,88,99};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("----------");
		for(int x : arr) {
			System.out.println(x);
		}
		System.out.println("---------");
		int md[][] = new int[6][];
		md[0] = new int[20];
		md[1] = new int[3];
		md[2] = new int[7];
		md[3] = new int[2];	
		md[4] = new int[15];
		md[5] = new int[4];
		for(int i=0;i<md.length;i++) {
			for(int j=0;j<md[i].length;j++) {
				System.out.print(md[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("--------------");
		for(String s : args) 
		{
			System.out.println(s);
		}
		System.out.println("--------------------");
		Emp e[]= new Emp[5];
		String str[] = {"Sumit","Shubham","Yash","Akhil","Paras","Rahul"};
		for(int i=0;i<str.length;i++) {
			e[i] = new Emp();
			e[i].name = str[i];
		}
		for(Emp emp : e) {
		System.out.println(emp.name);
		}
	}
}

class Emp {
	public String name;
}