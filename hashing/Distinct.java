package hashing;
import java.util.*;

public class Distinct {
	
	static int distinct(int array[])
	{
		Set<Integer> distinct=new HashSet<>();
		for(int a:array)
		{
			distinct.add(a);
		}
		System.out.println(distinct);
		return distinct.size();
	}
	
	
	static void printArray(int array[])
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
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=rd.nextInt(10);
		}
		printArray(array);
		System.out.println(distinct(array));
		
		
	}
	

}
