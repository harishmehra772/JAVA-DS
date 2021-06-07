package strings;
import java.util.*;

public class lexico {
	
	static int fact(int n)
	{
		if(n<=1)
			return 1;
		else return n*fact(n-1);
	}
	
	static void populate(int count[], String str)
	{
		for(int i=0;i<str.length();i++)
		{
			count[str.charAt(i)]++;
		}
		
		for(int i=1;i<256;i++)
		{
			count[i]+=count[i-1];
		}
	}
	
	static void update(int count[],char ch)
	{
		for(int i=ch;i<256;i++)
			count[i]--;
	}
	
	static int rank(String str)
	{
		int rank=1;
		int mul=fact(str.length());
		int count[]=new int[256];
		populate(count,str);
		for(int i=0;i<str.length();i++)
		{
			mul/=str.length()-i;
			rank+=count[str.charAt(i)-1]*mul;
			update(count,str.charAt(i));
			
		}
		return rank;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.next();
		System.out.println(rank(str));
		
		
	}

}
