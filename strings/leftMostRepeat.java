package strings;
import java.util.*;
public class leftMostRepeat {
	
	static char left(String str)
	{
		int index[]=new int[256];
		int leftMost=Integer.MAX_VALUE;
		for(int i=0;i<256;i++)
		{
			index[i]=-1;
		}
		
		for(int i=0;i<str.length();i++)
		{
			if(index[str.charAt(i)]==-1)
			index[str.charAt(i)]=i;
			else 
				leftMost=Math.min(leftMost,index[str.charAt(i)]);
				
		}
		if(leftMost>str.length())
			return '`';
		return str.charAt(leftMost);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.next();
		System.out.println(left(str));
	}

}
