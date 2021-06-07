package sorting;

import java.util.Random;
import java.util.Scanner;

public class Selection {
	public static void selectionSort(int array[])
	{
		int n=array.length;
		for(int i=0;i<n-1;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if(array[j]<array[min])
				{
					min=j;
				}
			}
				if(min!=i)
				{
					int temp=array[i];
					array[i]=array[min];
					array[min]=temp;
				}
			
		}
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
		selectionSort(array);
		for(int a:array)
			System.out.print(a+" ");
			System.out.println();
	}
}
