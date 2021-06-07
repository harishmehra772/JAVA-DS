package arrays;
import java.util.*;
public class MaxSum {
	
	static int bruteForce(int array[],int n)
	{
		int maxSum=-1;
		for(int i=0;i<n;i++)
		{
			int sum=0;
			for(int j=i;j<n;j++)
			{
				sum+=array[j];
				if(sum>=maxSum)
				{
					maxSum=sum;
					
				}
			}
			
		}
		return maxSum;
	}
	
	
	//Kadane's Algorithm
	
	public static int Kadane(int array[])
	{
		int maxSum=0;
		int currSum=0;
		for(int i=0;i<array.length;i++)
		{
			currSum+=array[i];
			if(currSum>maxSum)
			{
				maxSum=currSum;
			}
			if(currSum<0)
			{
				currSum=0;
			}
		}
		return maxSum;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int []array=new int[n];
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("The array is :");
		for(int a:array)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("The max sum is:"+bruteForce(array,n));
		System.out.println("The max sum is:"+Kadane(array));
	}

}
