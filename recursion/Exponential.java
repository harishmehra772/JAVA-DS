package recursion;
import java.util.*;
public class Exponential {
	
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int a,b;
		System.out.println("Enter the value of a and b :");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("The answer is :"+power(a,b));
		
		
	}
	static int power(int a,int b)
	{
		if(b==0)
			return 1;
		
		return a*power(a,b-1);
	}

}
