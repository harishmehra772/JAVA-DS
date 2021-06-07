package arrays;

import java.util.Random;
import java.util.Scanner;

public class WindowSliding {
	public static int bruteForce(int array[],int k)
	{
		int n=array.length;
		int maxSum=-1;
		
		for(int i=0;i<n-k+1;i++)
		{
			int curSum=0;
			for(int j=0;j<k;j++)
			{
				curSum+=array[i+j];
			}
			maxSum=Math.max(maxSum, curSum);
		}
		
		return maxSum;
	}
	//using time complexity O(n)
	
	public static int slidingWindow(int array[],int k)
	{
		int n=array.length;
		int winSum=0;
		int maxSum=0;
		for(int i=0;i<k;i++)
		{
			winSum+=array[i];
		}
		maxSum=winSum;
		for(int i=k;i<n;i++)
		{
			winSum=winSum+array[i]-array[i-k];
			maxSum=Math.max(maxSum, winSum);
		}
		return maxSum;
	}
	public static void main(String args[])
	{
	
	Scanner sc=new Scanner(System.in);
	Random rd=new Random();
	System.out.println("Enter the size of the array:");
	int n=sc.nextInt();
	int array[]=new int[n];
	
	
	for(int i=0;i<n;i++)
	{
		array[i]=rd.nextInt(10+10)-10;
	}
	
	for(int a:array)
	{
		System.out.print(a+" ");
	}
	System.out.println();
	System.out.println("Enter the size of the window:");
	int k=sc.nextInt();
	System.out.println("The maximum sum is :"+slidingWindow(array,k));
	
	}

	
}
