package arrays;
import java.util.*;

public class Leaders {
	
	// time complexity O(n^2)
	public static void Leaders(int array[],int n)
	{
		for(int i=0;i<n;i++)
		{
			int j;
			for(j=i+1;j<n;j++)
			{
				if(array[j]>array[i])
				{
					break;
				}
			}
				if(j==n) 
				System.out.print(array[i]+" ");	
		}
	}
	
	//time complexity O(n)
	public static void leaders(int array[],int n)
	{
		int rightMax=array[n-1];
		System.out.print(rightMax+" ");
		for(int i=n-2;i>-1;i--)
		{
			
			if(array[i]>rightMax)
			{
				rightMax=array[i];
			System.out.print(rightMax+" ");
			
			}
		}
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
		leaders(array,n);
	}
	
}
