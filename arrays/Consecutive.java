package arrays;

import java.util.Scanner;

public class Consecutive {
	
	public static void answer(int array[],int n)
	{
		int count=0;
		int maxCount=0;
		for(int i=0;i<n;i++)
		{
			if(array[i]==1)
			count++;
			if(count>maxCount)
			{
				maxCount=count;
			}
			if(array[i]==0)
			{
				count=0;
			}
		}
		System.out.println("Max Consecutive 1's: "+maxCount);
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
	answer(array,n);
	}
}
