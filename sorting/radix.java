package sorting;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class radix {
	
	public static void countSort(int array[],int exp)
	{
		int max=Arrays.stream(array).max().getAsInt();
		int min=Arrays.stream(array).min().getAsInt();
		int range=max-min+1;
		int count[]=new int[range];
		int output[]=new int[array.length];
		for(int i=0;i<array.length;i++)
		{
			count[(array[i]/exp)%range]++;
		}
		for(int i=1;i<count.length;i++)
		{
			count[i]+=count[i-1];
		}
		
		for(int i=array.length-1;i>=0;i--)
		{
			output[count[(array[i]/exp)%range]-1]=array[i];
			count[(array[i]/exp)%range]--;
		}
		
		for(int i=0;i<array.length;i++)
		{
			array[i]=output[i];
		}
	}
	
	public static void radixSort(int array[])
	{
		int max=Arrays.stream(array).max().getAsInt();
		for(int  i=1;max/i>0;i*=10)
		{
			countSort(array,i);
		}
	}
	
	public static void print(int array[])
	{
		for(int a:array)
		{
			System.out.print(a+" ");
		}
		System.out.println();
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Random rd=new Random();
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=rd.nextInt(1000);
		}
		print(array);
		radixSort(array);
		print(array);
	}

}


