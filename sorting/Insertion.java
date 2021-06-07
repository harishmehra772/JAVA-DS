package sorting;

import java.util.Random;
import java.util.Scanner;

public class Insertion {
	public static void insertionSort(int array[])
	{
		int n=array.length;
		for(int i=1;i<n;i++)
		{
			int temp=array[i];
			int j=i-1;
			while(j>-1&&temp<array[j])
			{
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=temp;
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
		insertionSort(array);
		for(int a:array)
			System.out.print(a+" ");
			System.out.println();
	}

}
