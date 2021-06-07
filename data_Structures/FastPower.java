package data_Structures;
import java.util.*;

public class FastPower {

	public static void main(String args[])
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the number and the power:");
		long n=sc.nextInt();
		long p=sc.nextInt();
		long res=fastPower(n,p,1000000007);
		System.out.println("The result:"+res);
	}
	static long fastPower(long a,long b,int n)
	{
		long res=1;
		while(b>0)
		{
			if( (b&1)!=0)
			{
				res=(res*a)%n;
			}
			a=(a*a)%n;
			b>>=1;
		}
		return res;
	}
}
