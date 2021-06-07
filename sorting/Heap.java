package sorting;
import java.util.*;

public class Heap {
	
	static void heapSort(int array[])
	{
		int n=array.length;
		for(int i=n/2-1;i>=0;i--)
			heapify(array,n,i);
		
		for(int i=n-1;i>0;i--)
		{
			int temp=array[0];
			array[0]=array[i];
			array[i]=temp;
			
			heapify(array,i,0);

		}
	}
	static void heapify(int array[]	,int n,int i)
	{
		int largest=i;
		int l=2*i+1; //left child
		int r=2*i+2; //right child
		if(l<n && array[l]>array[largest])
			largest=l;
		if(r<n && array[r]>array[largest])
			largest=r;
		
		if(largest!=i)
		{
			int temp=array[i];
			array[i]=array[largest];
			array[largest]=temp;
			
			heapify(array,n,largest);
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
			array[i]=sc.nextInt();
		}
		print(array);
		heapSort(array);
		
		System.out.println("Sorted Array:");
		print(array);
		
	}

}
