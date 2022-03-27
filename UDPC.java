import java.io.*;
import java.net.*;
public class UDPC
{
public static void main(String[] args)
{
DatagramSocket skt;
String str;
try
{
skt=new DatagramSocket(3000);
byte[] b = new byte[1000];
while(true){
DatagramPacket reply = new DatagramPacket(b,b.length);
skt.receive(reply);
str = new String(reply.getData(),0,reply.getLength());
System.out.println("client received:"+str);
}
}
catch(Exception ex)
{
System.out.println(ex);
}
}
}