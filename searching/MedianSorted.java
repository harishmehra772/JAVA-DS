package searching;
import java.util.*;
public class MedianSorted {
	
	public static double median(int input1[],int input2[])
	{
		if(input1.length>input2.length)
			return median(input2,input1);
		int x=input1.length;
		int y=input2.length;
		int low=0;
		int high=x;
		while(low<=high)
		{
			int partitionX=(low+high)/2;
			int partitionY=(x+y+1)/2-partitionX;
			int maxLeftX=(partitionX==0)?Integer.MIN_VALUE:input1[partitionX-1];
			int maxLeftY=(partitionY==0)?Integer.MIN_VALUE:input2[partitionY-1];
			int minRightX=(partitionX==x)?Integer.MAX_VALUE:input1[partitionX];
			int minRightY=(partitionY==y)?Integer.MAX_VALUE:input2[partitionY];
			if(maxLeftX<=minRightY&&maxLeftY<=minRightX)
			{
				if((x+y)%2==0)
					return (double)(Math.max(maxLeftY,maxLeftX)+Math.min(minRightX, minRightY))/2;
				else
					return (double)Math.max(maxLeftY, maxLeftX);
			}
			else if(maxLeftX>minRightY)
				high=partitionX-1;
			else
				low=partitionX+1;
		}
		return (double)-1;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Random rd=new Random();
		System.out.println("Enter the size of first array:");
		int n=sc.nextInt();
		System.out.println("Enter the size of the second array:");
		int m=sc.nextInt();
		int array[]=new int[n];
		int arrayb[]=new int[m];
		for(int i=0;i<n;i++)
		{
			array[i]=rd.nextInt(30);
			
		}
		for(int i=0;i<m;i++)
		{
			arrayb[i]=rd.nextInt(30);
			
		}
		
		Arrays.sort(array);
		Arrays.sort(arrayb);
		for(int a:array)
			System.out.print(a+" ");
		System.out.println();
		for(int a:arrayb)
			System.out.print(a+" ");
		System.out.println();
		System.out.println(median(array,arrayb));
	}

}
