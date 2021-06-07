package searching;
import java.util.*;

public class Sqrt {
	
	public static int sqrt(int n)
	{
		int answer=0;
		int l=0;
		int r=n;
		if(n==0||n==1)
			return n;
		while(l<=r)
		{
		int mid=l+(r-l)/2;
		if(mid*mid==n)
			return mid;
		else if(mid*mid<n)
		{
			l=mid+1;
			answer=mid;
		}
		else
			r=mid-1;
		}
		return answer;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Random rd=new Random();
		System.out.println("Enter the number ");
		int n=rd.nextInt(1000);
		System.out.println(n+" :"+sqrt(n));
		
		
	}
	

}
