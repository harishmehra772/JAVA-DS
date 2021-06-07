package searching;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Binary {
	//recursive
	public static int recursive(int array[],int ele,int l,int r)
	{
		if(r>l)
		{
		int mid=(l+r)/2;
		if(array[mid]==ele)
			return mid;
		else if(array[mid]<ele)
			return recursive(array,ele,mid+1,r);
		else 
		return recursive(array,ele,l,mid-1);
		}
		return -1;
	}
	//iterative
	public static void binary(int array[],int ele)
	{
		int r=array.length;
		int l=0;
		boolean found=false;
		while(l<r)
		{
		int mid=(l+r)/2;
		if(array[mid]==ele)
		{
			System.out.println("element found at"+mid);
			found=true;
			break;
		}
		else if(array[mid]<ele)
		{
			l=mid+1;
		}
		else
		{
			r=mid-1;
		}
		}
		if(!found)
		System.out.println("Element not found");
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
			array[i]=rd.nextInt(30);
		}
		
		for(int a:array)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		
		Arrays.sort(array);
		for(int a:array)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("Enter the element to be searched:");
		int ele=sc.nextInt();
	//	binary(array,ele);
		int index=recursive(array,ele,0,array.length);
		if(index!=-1)
		{
			System.out.println("Element is found at "+index);
		}
		else
			System.out.println("Not Found");
	}
		
		
}
