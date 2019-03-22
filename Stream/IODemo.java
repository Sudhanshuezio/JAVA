import java.io.*;

public class IODemo 
{
	public static void main(String args[])
	{
		/*try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the name: ");
			String name = br.readLine();
			
			System.out.println("Enter age: ");
			int age = Integer.parseInt(br.readLine());
			
			System.out.println("----------------------");
			System.out.println(name + " " + age);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		*/
		
		try
		{
			/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the name of file: ");
			String fname = br.readLine();
			File f = new File(fname);
			if(f.exists())
			{
				BufferedReader fr = new BufferedReader(new FileReader(fname));
				String line = null;
				while((line=fr.readLine()) != null)
				{
					System.out.println(line);
				}
				fr.close();
			}
			else 
			{
				System.out.println("Sorry! File doesn't exist");
			}
			br.close();
			*/
			//--------------------------------------
		
			//PrintWriter pw = new PrintWriter(System.out);
			/*
			PrintWriter pw = new PrintWriter(new FileOutputStream("Abc.txt",true));
			pw.println("HEllo Everybody");
			pw.flush();
			pw.close();
			*/
			//--------------------------------------
	
			File dir1 = new File("abc");
			dir1.mkdir();
			File dir2 = new File(dir1,"xyz");
			dir2.mkdir();
			File f = new File(dir2, "atoz.txt");
			f.createNewFile();
			PrintWriter pw = new PrintWriter(new FileOutputStream(f,true));
			pw.println(args[0]);
			pw.flush();
			pw.close(); 
		}

		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}