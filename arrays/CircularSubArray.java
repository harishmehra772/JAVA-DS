package arrays;
import java.util.*;

public class CircularSubArray {
	public static int kadane(int array[],int n)
	{
		int curSum=0;
		int maxSum=0;
		for(int i=0;i<n;i++)
		{
			curSum+=array[i];
			if(curSum>maxSum)
			{
				maxSum=curSum;
			}
			if(curSum<0)
			{
				curSum=0;
			}
		}
		return maxSum;
	}
	
	public static int reverseKadane(int array[],int n)
	{
		int total=0;
		for(int i=0;i<n;i++)
		{
			total+=array[i];
		}
		//reversing the array
		for(int i=0;i<n;i++)
		{
			array[i]=-array[i];
		}
		int rev=kadane(array,n);
		int result=rev+total;
		if(rev==-total)
		{
			return total;
		}
		else return result;
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
		array[i]=rd.nextInt(10+10)-10;
	}
	for(int a:array)
	{
		System.out.print(a+" ");
	}
	System.out.println();
	System.out.println("Circular max subarray:"+Math.max(kadane(array,n),reverseKadane(array,n)));
	
	}
	

}
