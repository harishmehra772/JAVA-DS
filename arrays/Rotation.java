package arrays;
import java.util.*;
public class Rotation {
	static void rotate(int arr[],int n,int d)
	{
		int temp[]=new int[d];
		for(int i=0;i<d;i++)
		{
			temp[i]=arr[i];
		}
		for(int i=0;i<n-d;i++)
		{
			arr[i]=arr[i+d];
		}
		for(int i=n-d,j=0;i<n;i++,j++)
		{
			arr[i]=temp[j];
		}
		for(int e:arr)
		{
			System.out.print(e+"  ");
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		rotate(array,n,2);
	}

}
