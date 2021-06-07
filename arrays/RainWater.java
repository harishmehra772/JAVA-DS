package arrays;
import java.util.*;

public class RainWater {
	// using space of 0(n)
	public static int rainWater(int array[])
	{
		int answer=0;
		int n=array.length;
		int[] left=new int[n];
		int[] right=new int[n];
		left[0]=array[0];
		right[n-1]=array[n-1];
		
		for(int i=1;i<n;i++)
		{
			left[i]=Math.max(left[i-1],array[i]);
		}
		
		for(int i=n-2;i>=0;i--)
		{
			right[i]=Math.max(right[i+1],array[i]);
		}
		
		for(int i=0;i<n;i++)
		{
			answer+=Math.min(left[i],right[i])-array[i];
		}
		return answer;
	}
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int[] array=new int[n];
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		for(int a:array)
		{
		System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("The answer is: "+rainWater(array));
		
	}

}
