package recursion;
import java.util.*;

public class Sum {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range:");
		int n=sc.nextInt();
		System.out.println("The sum upto "+n+" is: "+sum(n));
	}
	
	static int sum(int n)
	{
		if(n==0)
			return 0;
		return n+ sum(n-1);
	}

}
