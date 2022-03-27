import java.util.Scanner;
import java.io.*;

public class bell{

private int D[];
private static int num_ver;
public static final int MAX=999;


public bell(int num_ver)
{
this.num_ver=num_ver;
D = new int[num_ver+1];

}

public void belleval(int source,int A[][])
{
for(int n=1;n<=num_ver;n++)
{
   D[n]=MAX;
   
}

D[source]=0;

for(int n=1;n<=num_ver-1;n++){
for(int sn=1;sn<=num_ver;sn++){
 for(int dn=1;dn<=num_ver;dn++){
   if(A[sn][dn]!=MAX) 
        {
      if(D[dn] > D[sn]+A[sn][dn])
      {
     D[dn]=D[sn]+A[sn][dn];  
      }     
        }
}
}}


for(int sn=1;sn<=num_ver;sn++){
 for(int dn=1;dn<=num_ver;dn++){
      if(D[dn] > D[sn]+A[sn][dn])
      {
     System.out.println("Negative");
     return;  
  
        }
}
}

for (int vertex=1;vertex<=num_ver;vertex++)
{
System.out.println("distance of source"+source+"to"+vertex+"is"+D[vertex]);
}
}

public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of vertex");
num_ver = sc.nextInt(); 
int A[][] = new int[num_ver+1][num_ver+1];

System.out.println("Enter the adjancency matrix");
for(int sn=1;sn<=num_ver;sn++){
 for(int dn=1;dn<=num_ver;dn++){
   A[sn][dn]=sc.nextInt();
   if(sn==dn){
     A[sn][dn] = 0;
       continue;   
       }
  if(A[sn][dn] == 0)
         {
       A[sn][dn] = MAX; 
          }
  }
}

System.out.println("Enter the source matrix");
int source = sc.nextInt();
bell b=new bell(num_ver);
b.belleval(source,A);

}


}

