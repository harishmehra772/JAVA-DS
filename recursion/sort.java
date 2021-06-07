package recursion;
import java.util.*;

public class sort {
	
	
	static void recSort(int array[],int n)
	{
		if(n==1)
		{
			return;
		}
		   for (int i=0; i<n-1; i++)
	            if (array[i] > array[i+1])
	            {
	                // swap arr[i], arr[i+1]
	                int temp = array[i];
	                array[i] = array[i+1];
	                array[i+1] = temp;
	            }
		recSort(array,n-1);
	}
	
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Random rd = new Random();
		System.out.println("Size??");
		int n=sc.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=rd.nextInt(30);
		}
		

		for(int a:array)
		{
			System.out.print(a+" ");
		}
		recSort(array,n);
		System.out.println();
		
		for(int a:array)
		{
			System.out.print(a+" ");
		}
		
		
	}

}
