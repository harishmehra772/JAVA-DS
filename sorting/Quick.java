package sorting;
import java.util.*;

public class Quick {
	public static void quickSort(int array[],int l,int h)
	{
		if(l<h)
		{
		int pivot=partition(array,l,h);
		quickSort(array,l,pivot);
		quickSort(array,pivot+1,h);
		}
		
	}
	public static int partition(int array[],int l,int h)
	{
		int pivot=array[l];
		int i=l-1;
		int j=h+1;
		while(true)
		{
			do
			{
				i++;
			}
			while(array[i]<pivot);
			do
			{
				j--;
			}
			while(array[j]>pivot);
			if(i>=j)
				return j;
				
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			
		}
		//swap(array[l],array[j]);
		//return j;
		}
	
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Random rd=new Random();
		System.out.println("Enter the size of the first array:");
		int n=sc.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=rd.nextInt(10);
		}
		
		for(int a :array)
			System.out.print(a+" ");
		System.out.println();
		
		quickSort(array,0,(array.length)-1);
		
		for(int a:array)
			System.out.print(" "+a);
		
	}

}
