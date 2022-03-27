import java.io.*;
import java.net.*;
public class UDPS
{
public static void main(String[] args)
{
DatagramSocket skt=null;
int ch =0;
try
{
skt=new DatagramSocket();
InetAddress ip = InetAddress.getByName("localhost");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
do
{
System.out.println("Enter the message:");
String msg = br.readLine();
DatagramPacket dp = new DatagramPacket(msg.getBytes(),msg.length(),ip,3000);
skt.send(dp);
System.out.println("Do you wish to continue: 1 for no 0 for yes");
ch = Integer.parseInt(br.readLine());
}while(ch==0);
} catch(Exception ex)
{
System.out.println(ex);
}
}
}