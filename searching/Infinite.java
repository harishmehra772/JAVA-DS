package searching;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Infinite {
	static int binary(int array[],int l,int r,int key)
	{
		if(l>r)
			return -1; 
		int mid=l+(r-l)/2;
		if(array[mid]==key)
			return mid;
		if(array[mid]>key)
		return binary(array,l,mid-1,key);
		return binary(array,mid+1,r,key);
	}
	static int findPosition(int array[],int key)
	{
		int l=0;
		int r=1;
		while(key>array[r])
		{
			l=r;
			if(2*r<array.length-1)
			r=2*r;
			else r=array.length-1;
		}
		return binary(array,l,r,key);
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
		System.out.print(a+" ");
		System.out.println();
		Arrays.sort(array);
		for(int a:array)
			System.out.print(a+" ");
		System.out.println();
		System.out.println("Enter the key");
		int ele=sc.nextInt();
		
		System.out.println(findPosition(array,ele));
	}

}
