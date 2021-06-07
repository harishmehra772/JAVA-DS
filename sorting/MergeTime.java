package sorting;
import java.util.*;

public class MergeTime {
	
	public static void mergeIntervals(Interval array[])
	{
		Stack<Interval> stack=new Stack<>();
		Arrays.sort(array,new Comparator<Interval>(){
		public int compare(Interval i1,Interval i2)
		{
			return i1.start-i2.start;
		}
		});
		
		stack.push(array[0]);
		for(int i=1;i<array.length;i++)
		{
			Interval top=stack.peek();
			if(top.end<array[i].start)
			{
				stack.push(array[i]);
			}
			else if(top.end<array[i].end)
			{
				top.end=array[i].end;
				stack.pop();
				stack.push(top);
			}
		}
		System.out.println("Merged Intervals:");
		while(!stack.isEmpty())
		{
			Interval t=stack.pop();
			System.out.println("{"+t.start+" "+t.end+"}");
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		Interval array[]=new Interval[n];
		System.out.println("Enter the values:");
		for(int i=0;i<n;i++)
		{
			
			int start=sc.nextInt();
			int end=sc.nextInt();
			array[i]=new Interval(start,end);
			
		}
		mergeIntervals(array);
		
	}

}


class Interval
{
	int start;
	int end;
	Interval(int start,int end)
	{
		this.start=start;
		this.end=end;
	}
}