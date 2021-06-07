package searching;

import java.util.Random;
import java.util.Scanner;

public class Peak {
	public static int findPeak(int array[],int l,int r)
	{
		if(l>r)
			return -1;
		int mid=l+(r-l)/2;
		if(mid==0||array[mid]>array[mid+1]&&(mid==r-1||array[mid]>array[mid-1]))
			return mid;
		else if(array[mid+1]>array[mid])
			return findPeak(array,mid+1,r);
		else return findPeak(array,l,mid-1);
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
		for(int a:array)
		System.out.print(a+" ");
		System.out.println();
		System.out.println("The peak element index is:"+findPeak(array,0,array.length-1));
	}

}
