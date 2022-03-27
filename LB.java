import java.util.Scanner;
import java.lang.*;

public class LB{


  public static void main(String[] args)
  {
   Scanner sc = new Scanner(System.in);
   int cap,oprt,res;
   int ch,cont,x,i=0,nsec;
   int dp=0;
   int[] inp = new int[25];

   
   
   System.out.println("Enter the Bucket Size");
   cap = sc.nextInt();
   System.out.println("Enter the oprt ");
   oprt = sc.nextInt();   
   
   do{
     System.out.println("The packet at nsec "+ (i+1) );
	 inp[i++] = sc.nextInt();
     System.out.println("Do you wish to continue" );
	 ch=sc.nextInt();
    nsec=i;
   }while(ch==1);
   
   System.out.println("\n :second\t\t:Recv\t\t:Sen\t\t:Bucket\t\t:dropped");
   for(i=cont=0;(cont>0)||i<nsec;i++)
   {
   
   System.out.print(+(i+1));
   System.out.print("\t\t:"+inp[i]);
   res = Math.min(cont+inp[i],oprt);
   System.out.print("\t\t"+res);
   if((x=cont+inp[i]-oprt)>0)
   {
     if(cont<cap){ cont=cap; dp=x-cap;}
           else
		     {cont=0;dp=0;}
        }
     else
       {  cont=0; }
   System.out.print("\t\t"+cont);
   System.out.print("\t\t"+dp+"\n");
   
   
   }
   }
   
  
  }

