package data_Structures;
import java.util.*;

public class EuclidGcd {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two number to find gcd:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int gcd=GCD(a,b);
		System.out.println("The greatest common divisor is:"+gcd);
		System.out.println("The least common multiple:"+(a*b/gcd));
		
	}
	static int GCD(int a,int b)
	{
		if(b==0)
			return a;
		else
		return GCD(b,a%b);
	}
}
