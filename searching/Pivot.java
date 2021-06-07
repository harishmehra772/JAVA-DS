package searching;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Pivot {
	
	static int singleSearch(int array[],int l,int r,int key)
	{
		if(l>r)
			return -1;
		int mid=(l+r)/2;
		if(array[mid]==key)
			return mid;
		if(array[l]<=array[mid])
		{
			if(key<=array[mid]&&key>=array[l])
				return singleSearch(array,l,mid-1,key);
			return singleSearch(array,mid+1,r,key);
		}
		else
		{
			if(key>=array[mid]&&key<=array[r])
				return singleSearch(array,mid+1,r,key);
			return singleSearch(array,l,mid-1,key);
		}
		
	}
	
	static int binarySearch(int array[],int l,int r,int key)
	{
		int pivot=Pivot(array,0,array.length-1);
		if(pivot==-1)
		{
			return binary(array,0,array.length-1,key);
		}
		
		if(array[pivot]==key)
		{
			return pivot;
		}
		if(array[0]<=key)
			return binary(array,0,pivot-1,key);
		return binary(array,pivot+1,array.length-1,key);
	}
	
	static int binary(int array[],int l,int r,int key)
	{
		if(l>r)
			return -1;
		
			int mid=(l+r)/2;
			if(array[mid]==key)
				return mid;
			if(array[mid]<key)
				return binary(array,mid+1,r,key);
				return binary(array,l,mid-1,key);
		
	}
	
	static void rotate(int array[])
	{
		Random rd=new Random();
		int n=rd.nextInt(array.length);
		
		for(int j=0;j<n;j++)
		{
			int temp=array[0];
		for(int i=0;i<array.length-1;i++)
		{
			array[i]=array[i+1];
		}
		array[array.length-1]=temp;
		}
		for(int a:array)
		{
			System.out.print(" "+a);
		}
		System.out.println();
	}
	
	static int Pivot(int array[],int l,int r)
	{
		if(l>r)
			return -1;
		if(l==r)
			return l;
		
		
			int mid=(l+r)/2;
			if (mid < r && array[mid] > array[mid + 1])
	            return mid;
	        if (mid > l && array[mid] < array[mid - 1])
	            return (mid - 1); 
			
			if(array[l]>=array[mid])
			return Pivot(array,l,mid-1);
			return Pivot(array,mid+1,r);
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
			array[i]=rd.nextInt(10);
		}
		Arrays.sort(array);
		
		for(int a:array)
		{
			System.out.print(a+" ");
		}
		System.out.println();
	
		/*if(binFirst(array,ele)!=-1)
		{
			System.out.println("The first occurence is : "+binFirst(array,ele));
		}
		else
			System.out.println("Not found");*/
		rotate(array);
		System.out.println("Enter the element to be searched:");
		int ele=sc.nextInt();
		System.out.println(binarySearch(array,0,array.length-1,ele));
		System.out.println(singleSearch(array,0,array.length-1,ele));
		
		}
}
