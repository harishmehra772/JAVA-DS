package set;
import java.util.*;
public class SumArray {
	public static void main(String args[])
	{
		int array[]= {4,2,4,-4,9};
		int k=3;
		boolean found=false;
		Set<Integer> answer=new HashSet<>();
		int sum=0;
		for(int element:array)
		{
			answer.add(sum);
			sum+=element;
			if(answer.contains(sum-k))
			{
				found =true;
				break;
			}
		}
		if(found)
		{
			System.out.println("true");
		}
		else
			System.out.println("False");
	}

}
