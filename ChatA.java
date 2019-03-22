import java.io.*;
import java.net.*;

public class ChatA
{
	public static void main(String args[]) 
	{
		try
		{
			byte[] data1 = new byte[1024];
			InetAddress ia = InetAddress.getLocalHost();
			//InetAddress ia = InetAddress.getByName("10.249.34.52");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			DatagramSocket ds1 = new DatagramSocket(1095);	
			DatagramPacket dp1 = null;

			System.out.println("You: " );
			String line1 = null;
			do
			{
				line1 = br.readLine();
				data1 = line1.getBytes();
				dp1 = new DatagramPacket(data1,data1.length,ia,1097);
				ds1.send(dp1);

			} while(!line1.equals("quit"));

			byte data2[] = new byte[1024];			

			DatagramSocket ds2 = new DatagramSocket(1095);
			DatagramPacket dp2 = new DatagramPacket(data2, data2.length);

			String line2 = null;
			do
			{
				ds2.receive(dp2);
				line2 = new String(dp2.getData(), 0, dp2.getLength());
				System.out.println(line2);
			} while(!line2.equals("quit"));

			ds1.close();
			ds2.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}