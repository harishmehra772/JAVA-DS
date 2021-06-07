package recursion;
import java.util.*;

public class PowerSet {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		powerSet(str,0," ");
		
	}
//	static void powerSet(String str,int i,String cur)
//	{
//		if(i==str.length())
//		{
//			System.out.println(cur);
//			return;
//		}
//		powerSet(str,i+1,cur+str.charAt(i));
//		powerSet(str,i+1,cur);
//		
//	}
	
	static void powerSet(String s ,int n,String curr)
	{
		if(n==s.length())
		{
			System.out.print(curr+" ");
			return;
		}
		powerSet(s,n+1,curr);
		powerSet(s,n+1,curr+s.charAt(n));
		
	}

}
