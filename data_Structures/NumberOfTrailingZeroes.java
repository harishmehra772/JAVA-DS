package data_Structures;
import java.util.*;

public class NumberOfTrailingZeroes {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int result=0;
		for(int i=5;i<=n;i*=5)
		{
			result+=n/i;
		}
		System.out.println("Number of trailing zeroes:"+result);
	}

}
