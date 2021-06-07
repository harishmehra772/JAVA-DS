package arrays;
import java.util.*;
public class Stocks1 {
	//bruteForce uses time complexity of O(n^2)
	
	static int bruteForce(int array[])
	{
		int maxProfit=-1;
		for(int i=0;i<array.length;i++)
		{
			int profit=0;
			for(int j=0;j<array.length;j++)
			{
				profit=array[j]-array[i];
				if(profit>maxProfit)
				{
					maxProfit=profit;
				}
			}
			
		}
		return maxProfit;
	}
	
	public static void space(int array[])
	{
		int maxProfit=0;
		int[] aux=new int[array.length];
		aux[(array.length)-1]=array[(array.length)-1];
		int max=aux[(array.length)-1];
		for(int i=array.length-2;i>-1;i--)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
			aux[i]=Math.max(array[i],max);
		}
		for(int a:aux)
		{
		System.out.print(a+" ");
		}
		for(int i=0;i<array.length;i++)
		{
			if((aux[i]-array[i])>maxProfit)
			{
				maxProfit=aux[i]-array[i];
			}
			System.out.println(maxProfit);
		}
		System.out.println("Final answer: "+maxProfit);
		
	}
	
	// more efficient way using time complexity O(n)
	public static int Stocks(int array[])
	{
		int maxProfit=0;
		int minSoFar=array[0];
		for(int i=0;i<array.length;i++)
		{
			minSoFar=Math.min(minSoFar,array[i]);
			int profit=array[i]-minSoFar;
			maxProfit=Math.max(maxProfit,profit);
		}
		
		return maxProfit;
	}
	
	//multiple buy and sell of stocks
	public static int mulStocks(int array[])
	{
		int profit=0;
		for(int i=1;i<array.length;i++)
		{
			if(array[i]>array[i-1])
				profit+=array[i]-array[i-1];
		}
		return profit;
	}
		public static void main(String args[])
		{
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the size of the array:");
			int n=sc.nextInt();
			int []array=new int[n];
			System.out.println("Enter the elements:");
			for(int i=0;i<n;i++)
			{
				array[i]=sc.nextInt();
			}
			for(int a:array)
			{
				System.out.print(a+" ");
			}
			System.out.println();
			//System.out.println("Max Profit: "+bruteForce(array));
			//space(array);
			System.out.println("MAx Profit: "+Stocks(array));
			System.out.println("Multiple trading profit: "+ mulStocks(array));
		}
	
}
