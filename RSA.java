import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.BigInteger;

  public class RSA{
    
 public static void main(String[] args)
        {
           Scanner sc = new Scanner(System.in);
		   Random r1 = new Random(System.currentTimeMillis());
		   Random r2 = new Random(System.currentTimeMillis()*10);
		   
		   System.out.println("Enter the publc key");
		   int public_key = sc.nextInt();
		   
		   BigInteger p = BigInteger.probablePrime(32,r1);
		     BigInteger q = BigInteger.probablePrime(32,r1);
			 BigInteger n = p.multiply(q);
			 BigInteger p1 = p.subtract(new BigInteger("1"));
			  BigInteger q1 = q.subtract(new BigInteger("1"));
			  BigInteger p1_q1 = p1.multiply(q1);
			  
			  
			  while(true){
			  BigInteger p1_q1_g  = p1_q1.gcd(new BigInteger(public_key+""));
			     if(p1_q1_g.equals(BigInteger.ONE)){ break; }
				 public_key++;
				 
			  
			  }
			 

			 BigInteger pub = new BigInteger(public_key+"");
			 BigInteger pri = pub.modInverse(p1_q1);
           

            System.out.println("public key"+pub)	;	   
            System.out.println("private key"+pri)	;


         System.out.println("Enter text");
        BigInteger val = sc.nextBigInteger();
        BigInteger cipher = val.modPow(pub,n);
        System.out.println(cipher);
        BigInteger plain = cipher.modPow(pri,n);
        System.out.println(plain);		
  
        }
    
  
  }