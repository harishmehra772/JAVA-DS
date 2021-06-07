package recursion;
import java.util.*;

public class Print {
	
	static void recPrint(int n)
	{
		if(n==1)
		{
			System.out.print(n+" ");
		return;}
		System.out.print(n+" ");
		recPrint(n-1);
		
	}
	
	static int factorial(int n)
	{
		if(n==0||n==1)
		{
			return 1;
		}
		return n*factorial(n-1);
	}
	public static void main(String args[])
	{
			System.out.println("Enter the number:");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			recPrint(n);
			System.out.println();
			System.out.println("Factorial: "+factorial(n));
			
			
			
	}

}
