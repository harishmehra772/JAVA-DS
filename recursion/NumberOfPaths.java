package recursion;
import java.util.*;

public class NumberOfPaths {
	static int count(int n,int m)
	{
		if(n==1||m==1)
		return 1;
		return count(n-1,m)+count(n,m-1);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the matrix :");
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.println("Number of paths: "+count(n,m));
	}

}
