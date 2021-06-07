package arrays;
import java.util.*;

public class Sorted {
	
	// recursive method with both time and space complexity as O(n)
	public static boolean isSorted(int array[],int n)
	{
		if(n==1||n==0)
			return true;
		if(array[n-2]>array[n-1])
			return false;
		return isSorted(array,n-1);
	}
	
	// iterative method
	public static boolean sorted(int array[],int n)
	{
		if(n==0||n==1)
			return true;
		for(int i=0;i<n-1;i++)
		{
			if(array[i]>array[i+1])
				return false;
		}
		return true;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int []array=new int[n];
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		for(int a:array)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("Is the array sorted: "+isSorted(array,n));
		System.out.println("Is sorted:"+sorted(array,n));
	}

}
