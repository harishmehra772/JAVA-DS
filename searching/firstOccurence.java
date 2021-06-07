package searching;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class firstOccurence {
	//using binary search
	public static int binFirst(int array[],int ele,int l,int r)
	{
		
		while(l<=r)
		{
			int mid=(l+r)/2;
			if(mid==0||array[mid]==ele&&array[mid-1]<ele)
				return mid;
			else if(array[mid]<ele)
			{
				return binFirst(array,ele,mid+1,r);
			}
			else
				return binFirst(array,ele,l,mid-1);
		}
		 return -1;
	}
	
	public static int binLast(int array[],int ele)
	{
		int l=0;
		int r=array.length-1;
		while(l<=r)
		{
			int mid=(l+r)/2;
			if(mid==array.length-1||array[mid]==ele&&array[mid+1]>ele)
			{
				if(array[mid]!=ele)
				{
					return -1;
				}
				return mid;
			}
			else if(array[mid]>ele)
			{
				r=mid-1;
			}
			else
			{
				l=mid+1;
			}
		}
		return -1;
	}
	
	//iterative method
	public static int linFirst(int array[],int ele)
	{
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==ele)
			{
				return i;
			}
		}
		return -1;
		
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
			array[i]=rd.nextInt(2);
		}
		Arrays.sort(array);
		
		for(int a:array)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("Enter the element to be searched:");
		int ele=sc.nextInt();
		/*if(binFirst(array,ele)!=-1)
		{
			System.out.println("The first occurence is : "+binFirst(array,ele));
		}
		else
			System.out.println("Not found");*/
		
		System.out.println(binFirst(array,ele,0,array.length-1));
		System.out.println(binLast(array,ele));
		
		}
	
}
