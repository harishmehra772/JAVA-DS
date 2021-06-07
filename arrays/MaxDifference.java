package arrays;
import java.util.*;

public class MaxDifference {
	public static void bruteForce(int array[],int n)
	{
		int maxDiff=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if((array[j]-array[i])>maxDiff)
				{
					maxDiff=(array[j]-array[i]);
				}
			}
		}
		System.out.println(maxDiff);
	}
	
	//Optimized solution with time complexity O(n)
	public static void Max(int array[],int n)
	{
		int minSoFar=array[0];
		int maxDifference=0;
		for(int i=0;i<n;i++)
		{
			minSoFar=Math.min(minSoFar, array[i]);
			int difference=array[i]-minSoFar;
			if(maxDifference<difference)
			{
				maxDifference=difference;
			}
		}
		System.out.println("Max Difference: "+maxDifference);
	}
	public static void main(String args[])
	{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the array:");
	int n=sc.nextInt();
	int array[]=new int[n];
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
	bruteForce(array,n);
	Max(array,n);
	}
	

}
