import java.io.*;

class IODemo2
{
	public static void main(String args[]) 
	{
		try
		{
			RandomAccessFile raf = new RandomAccessFile("abc.txt","rw");
			
			System.out.println(raf.readLine());

			raf.seek(raf.length());
			
			raf.writeBytes("JUST for Demo");

			raf.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
	}
}