package dsa;
import java.util.*;

public class PrimeMod {
	static void Prime(int n)
	{
		boolean prime[]=new boolean[n+1];
		for(int i=2;i<=n;i++)
		{
			prime[i]=true;
		}
		for(int p=2;p*p<=n;p++)
		{
			if(prime[p]==true)
			{
				for(int i=p*p;i<=n;i+=p)
				{
					prime[i]=false;
				}
			}
		}
		System.out.println("The prime numbers less than "+n+"are: ");
		for(int i=2;i<=n;i++)
		{
			if(prime[i]==true)
			System.out.print(i+"  ");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the limit: ");
		int limit=sc.nextInt();
		Prime(limit);
		
}

}
