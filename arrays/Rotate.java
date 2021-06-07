package arrays;
import java.util.*;

public class Rotate {
	
	//Juggling algo
	public static void Juggling(int array[],int d)
	{
		int n=array.length;
		d=d%n;
		int i,j,k,temp;
		int gcd=GCD(d,n);
		for(i=0;i<gcd;i++)
		{
			temp=array[i];
			j=i;
			while(true)
			{
				k=j+d;
				if(k>=n)
					k=k-n;
				if(k==i)
					break;
				array[j]=array[k];
				j=k;
			}
			array[j]=temp;
		}
		for(int a:array)
		{
			System.out.print(a+" ");
		}
	}
	public static int GCD(int a,int b)
	{
		if(b==0)
		return a;
		else
		return GCD(b,a%b);
	}
	//rotate left by d spaces
	public static void rotate(int array[],int d)
	{
		for(int i=0;i<d;i++)
		{
			rotateLeft(array);
		}
		for(int a:array)
			System.out.print(a+" ");
				System.out.println();
	}
	//rotate left by 1
	public static void rotateLeft(int array[])
	{
		int n=array.length;
		int temp=array[0];
		
		for(int i=0;i<n-1;i++)
		{
			array[i]=array[i+1];
		}
		array[n-1]=temp;
		/*for(int a:array)
			System.out.print(a+" ");*/
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n =sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter the elements :");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		
		for(int a:array)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		Juggling(array,4);
	
	}

}
