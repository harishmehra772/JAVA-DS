package data_Structures;
import java.util.*;

public class SieveOfEratosthenes {
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the the range:");
		int n=sc.nextInt();
		boolean isPrime[]=SieveOfEratosthenes(n);
		for(int i=0;i<=n;i++)
		{
			if(isPrime[i])
			System.out.print(i+"  ");
		}
		
	}
 static boolean[] SieveOfEratosthenes(int n)
  {
	  boolean isPrime[]=new boolean[n+1];
	  Arrays.fill(isPrime,true);
	  isPrime[0]=false;
	  isPrime[1]=false;
	  for(int i=2;i*i<=n;i++)
	  {
		  for(int j=2*i;j<=n;j+=i)
		  {
			  isPrime[j]=false;
		  }
	  }
	  return isPrime;
	  
  }
}
