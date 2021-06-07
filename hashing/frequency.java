package hashing;
import java.util.*;

public class frequency {
	
	static void freq(int array[])
	{
		Map<Integer,Integer> mp=new HashMap<>()
				;
		for(int i=0;i<array.length;i++)
		{
			if(mp.containsKey(array[i]))
			{
				mp.put(array[i], mp.get(array[i])+1);
			}
			else
				mp.put(array[i], 1);
		}
		
		for(Map.Entry<Integer,Integer> entry:mp.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
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
		freq(array);
		
		
		
	}
}
