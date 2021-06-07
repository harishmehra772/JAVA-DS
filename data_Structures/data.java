package data_Structures;
import java.util.*;

public class data {
	public static void main(String args[])
	{
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		System.out.println("Factorial :"+fact);
		
		
	}

}
