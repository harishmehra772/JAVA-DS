package searching;

import java.util.Random;
import java.util.Scanner;

public class Linear {
	
	//recursive
	public static int recursive(int array[],int i,int n,int ele)
	{
		if(i>=n)
			return 0;
		if(array[i]==ele)
			return i;
		return recursive(array,i+1,n,ele);
		}
	//iterative
	public static void linear(int array[],int ele)
	{
		int n=array.length;
		int flag=0;
		for(int i=0;i<n;i++)
		{
			if(array[i]==ele)
			{
				System.out.println("ELement is found at index: "+i);
				flag=1;
				break;
			}
			
		}
		if(flag==0)
		System.out.println("Not found.");
		
		
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
	System.out.println("Enter the element to be searched:");
	int ele=sc.nextInt();
	//linear(array,ele);
	if(recursive(array,0,array.length,ele)!=0)
	{
		System.out.println("Element found at:"+recursive(array,0,array.length,ele));
	}
	else System.out.println("Not found");
	}
	



}
