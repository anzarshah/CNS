import java.util.Scanner;
import java.lang.*;


public class LB{

public static void main(String[] args){
int drop=0;
int cap,oprt,res;
int cont,nsec;
int ch;
int x;
int i=0;
int[] inp = new int[25];
Scanner sc = new Scanner(System.in);
System.out.println("BUCKET SIZE");
cap = sc.nextInt();
System.out.println("OPRT FLOW");
oprt = sc.nextInt();

  do{
   System.out.println("The inp at second flow "+(i+1));
   inp[i++]=sc.nextInt();
  
   System.out.println("Do you wish to continye ");
     ch = sc.nextInt();
   

   }while(ch==1);
	     nsec=i;
   
   System.out.println("SECOND /t Packet Recv\t Packet sent\tBucket\tDrop\t");
   for(i=cont=0;(i<nsec)||(cont>0);i++)
   {
   System.out.print("\n"+(i+1));
    System.out.print("\t"+inp[i]);
	res=Math.min(inp[i]+cont,oprt);
	System.out.print("\t"+res); 
	if((x=cont+inp[i]-oprt)>0){
		if(x>cap){ 
		    cont = cap;
			drop = x-cap;
			 }
		else{
			cont=x;
			drop =0;
			}   		
	}else {cont = 0;}
	System.out.print("\t"+ cont);
    System.out.print("\t"+ drop +"\n"); 
   }


}
}
