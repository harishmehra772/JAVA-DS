package sorting;

import java.util.Random;
import java.util.Scanner;

public class Union {
	
	public static void union(int array1[],int array2[])
	{
		int n=array1[array1.length-1];
		int m=array2[array2.length-1];
		int ans;
		if(m>n)
			ans=m;
		else ans=n;
		int ind[]=new int[ans+1];
		System.out.print(array1[0]+" ");
		++ind[array1[0]];
		for(int i=1;i<array1.length;i++)
		{
			if(array1[i]!=array1[i-1])
			{
			System.out.print(array1[i]+" ");
			++ind[array1[i]];
			}
		}
		
		
		for(int i=0;i<array2.length;i++)
		{
			if(ind[array2[i]]==0)
			{
				System.out.print(array2[i]+" ");
				++ind[array2[i]];
			}
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Random rd=new Random();
		System.out.println("Enter the size of the first array:");
		int n=sc.nextInt();
		System.out.println("Enter the size of the second array:");
		int m=sc.nextInt();
		int array1[]=new int[n];
		System.out.println("First Array:");
		for(int i=0;i<n;i++)
		{
			array1[i]=sc.nextInt();
		}
		int array2[]=new int[m];
		System.out.println("Second array:");
		for(int i=0;i<m;i++)
		{
			array2[i]=sc.nextInt();
		}
		for(int a:array1)
		System.out.print(a+" ");
		System.out.println();
		
	
		for(int b:array2)
		{
			System.out.print(b+" ");
		}
		System.out.println();
		
		union(array1,array2);
	}

}
