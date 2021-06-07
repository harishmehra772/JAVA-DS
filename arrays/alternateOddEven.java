package arrays;
import java.util.*;

public class alternateOddEven {
	public static int answer(int array[],int n)
	{
		int longest=1;
		int count=1;
		for(int i=0;i<n-1;i++)
		{
			if(((array[i]+array[i+1])&1)==1)
			{
				count++;
			}
			else
			{
				longest=Math.max(longest, count);
				count=1;
			}
		
		}
		if(longest==1)
			return 0;
		return Math.max(longest, count);
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
		array[i]=rd.nextInt(20);
	}
	for(int a:array)
	{
		System.out.print(a+" ");
	}
	System.out.println();
	System.out.println("The longest length of odd/even:"+answer(array,n));
	
	}

}
