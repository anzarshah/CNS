import java.util.Scanner;
import java.io.*;

 public class crc  {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

         System.out.println("ENTER THE MESSAGE BIT");
         String message = sc.nextLine();
         System.out.println("ENTER THE key CHARATER BIT");
         String key = sc.nextLine();



         int[] data = new int[message.length()+key.length()-1];
        

 




int[] divisor = new int[key.length()]; 
      


   
         for(int i=0;i<message.length();i++){
             data[i]=Integer.parseInt(message.charAt(i)+"");
         }
         for(int i=0;i<key.length();i++){
             divisor[i]=Integer.parseInt(key.charAt(i)+"");
         }
         
         
 //calculation of crc
         for(int i=0;i<message.length();i++){
             if (data[i] == 1){
                 for(int j=0;j<key.length();j++){
                     data[i+j]^=divisor[j];
                 
                               }
                 
                                             }
                                        }
             
//display of crc
         for(int i=0;i<message.length();i++){
             data[i]=Integer.parseInt(message.charAt(i)+""); }
         for(int datum:data ){
             System.out.print(datum);}

             System.out.println();   
             
//check for input 

System.out.println("ENTER THE CRC BIT");
         message = sc.nextLine();
         System.out.println("ENTER THE key CHARATER BIT");
         key = sc.nextLine();
         data = new int[message.length()+key.length()-1];
         divisor = new int[key.length()]; 
         
         for(int i=0;i<message.length();i++){
             data[i]=Integer.parseInt(message.charAt(i)+"");
         }
         for(int i=0;i<key.length();i++){
             divisor[i]=Integer.parseInt(key.charAt(i)+"");
         }


  
         
 //calculation of crc
         for(int i=0;i<message.length();i++){
             if (data[i]==1){
                 for(int j=0;j<key.length();j++){
                     data[i+j]^=divisor[j];
                 
                               }
                 
                                             }
                                        }
             
//display of crc
         boolean valid = true;
         for(int datum:data) {
         if(datum == 1){
          valid = false;
          break;   
         }
          }    
   String check =(valid)?"Data stream is valid":"invalied";
 System.out.print(check);


 }}