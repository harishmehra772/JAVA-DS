package sorting;
import java.util.*;

public class Bubble {
	static void bubbleSort(int array[])
	{
		int n=array.length;
		for(int i=0;i<n-1;i++)
		{
			boolean swapped=false; 
			for(int j=0;j<n-1-i;j++)
			{
				if(array[j]>array[j+1])
				{
					swapped=true;
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
			if(!swapped)
				break;
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
		bubbleSort(array);
		for(int a:array)
			System.out.print(a+" ");
	}

}
