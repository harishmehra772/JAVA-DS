package arrays;
import java.util.*;

public class MajorityElements {
	
	//Brute force with time complexity O(n^2)
	static void bruteForce(int array[],int n)
	{
		int maxCount=0;
		int index=-1;
		for(int i=0;i<n;i++)
		{
			int count=0;
			
			for(int j=0;j<n;j++)
			{
				if(array[i]==array[j])
					count++;
			}
			if(count>=maxCount) {
				maxCount=count;
			index=i;
			}
		}
		if(maxCount>n/2)
			System.out.println(array[index]+" is the majority element");
		System.out.println("No majority element.");
	}
	
	//Little optimized using sorting with time complexity O(nlogn)
	static void sortMethod(int array[],int n)
	{
		Arrays.sort(array);
		int count=1;
		int maxCount=-1;
		int temp=array[0];
		for(int i=1;i<n;i++)
		{
			if(temp==array[i])
				count++;
			else {
				count=1;
				temp=array[i];
			}
			
			if(maxCount<count)
			{
				maxCount=count;
				if(maxCount>n/2)
				{
					System.out.println("The majority element:"+array[i]);
					System.exit(0);
					
				}
			}
		}
		System.out.println("No majority element.");
	}

	//Using HashMap -using O(n)space and time complexity O(n)
	public static void usingHash(int array[],int n)
	{
		HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
		for(int i=0;i<array.length;i++)
		{
			if(map.containsKey(array[i]))
			{
				int count=map.get(array[i])+1;
				if(count>array.length/2)
				{
					System.out.println("The majority element is : "+array[i]);
					System.exit(0);
				}
				else map.put(array[i], count);
			}
			else  map.put(array[i], 1);
		}
		System.out.println("No majority element found.");
	}
	
	// using Moore's Voting algorithm in O(n) time complexity
	public static int Moore(int array[],int n)
	{
		int ansIndex=0,count=1;
		for(int i=1;i<n;i++)
		{
			if(array[i]==array[ansIndex])
				count++;
			else count--;
			if(count==0)
			{
				ansIndex=i;
				count=1;
			}
		}
		return array[ansIndex];
	}
	
	public static void isMoore(int array[],int n)
	{
		int count=0;
		int answer=Moore(array,n);
		for(int i=0;i<n;i++)
		{
			if(array[i]==answer)
				count++;
			if(count>n/2)
			{
				System.out.println("The majority element is : "+answer);
				System.exit(0);
			}
			
		}
		System.out.println("No majority element present.");
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int[]array=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("The array is");
		for(int a :array)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		isMoore(array,n);
		
	}

}
