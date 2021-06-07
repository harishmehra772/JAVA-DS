package searching;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Median {
	public static int getMedian(int arr1[],int arr2[],int la,int ra,int lb,int rb)
	{
		if(ra-la==1)
		{
			return((Math.max(arr1[la],arr2[lb])+Math.min(arr1[ra], arr2[rb]))/2);
		}
		int m1=median(arr1,la,ra);
		int m2=median(arr2,lb,rb);
		if(m1==m2)
			return m1;
		else if(m1<m2)
			return getMedian(arr1,arr2,((la+ra+1)/2),ra,lb,((lb+rb+1)/2));
		else 
			return getMedian(arr1,arr2,la,((la+ra+1)/2),(lb+rb+1)/2,rb);
					
		
	}
	
	public static int median(int array[],int l,int r)
	{
		int n=r-l+1;
		if(n%2==0)
		{ 
			return (array[l+(n/2)]+array[l+(n/2-1)])/2;
		}
		else
		{
			return array[l+n/2];
		}
	
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Random rd=new Random();
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int array[]=new int[n];
		int arrayb[]=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=rd.nextInt(30);
			arrayb[i]=rd.nextInt(30);
		}
		
		
		Arrays.sort(array);
		Arrays.sort(arrayb);
		for(int a:array)
			System.out.print(a+" ");
		System.out.println();
		for(int a:arrayb)
			System.out.print(a+" ");
		System.out.println();
		System.out.println(getMedian(array,arrayb,0,array.length-1,0,arrayb.length-1));
	}

}
